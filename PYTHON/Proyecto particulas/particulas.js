// Bandera para saber si el usuario ha interactuado
window.human = false;

// Selección del elemento canvas y su contexto 2D
var canvasEl = document.querySelector('.fireworks');
var ctx = canvasEl.getContext('2d');

// Número de partículas por explosión
var numberOfParticules = 30;

// Coordenadas del puntero
var pointerX = 0;
var pointerY = 0;

// Determina el evento a usar para interacción: 'touchstart' en dispositivos táctiles, 'mousedown' en otros
var tap = ('ontouchstart' in window || navigator.msMaxTouchPoints) ? 'touchstart' : 'mousedown';

// Colores posibles para las partículas
var colors = ['#FF1461', '#18FF92', '#5A87FF', '#FBF38C'];

// Función para configurar el tamaño del canvas
function setCanvasSize() {
  // Ajusta el tamaño del canvas al doble del tamaño de la ventana para mayor resolución
  canvasEl.width = window.innerWidth * 2;
  canvasEl.height = window.innerHeight * 2;

  // Ajusta el estilo del canvas al tamaño de la ventana
  canvasEl.style.width = window.innerWidth + 'px';
  canvasEl.style.height = window.innerHeight + 'px';

  // Escala el contexto para mantener la proporción correcta
  canvasEl.getContext('2d').scale(2, 2);
}

// Función para actualizar las coordenadas del puntero
function updateCoords(e) {
  pointerX = e.clientX || e.touches[0].clientX;
  pointerY = e.clientY || e.touches[0].clientY;
}

// Función para determinar la dirección de una partícula
function setParticuleDirection(p) {
  // Calcula un ángulo aleatorio en radianes
  var angle = anime.random(0, 360) * Math.PI / 180;

  // Calcula un valor aleatorio para la distancia
  var value = anime.random(50, 180);

  // Elige un radio positivo o negativo aleatorio
  var radius = [-1, 1][anime.random(0, 1)] * value;

  // Devuelve la nueva posición basada en el ángulo y radio
  return {
    x: p.x + radius * Math.cos(angle),
    y: p.y + radius * Math.sin(angle)
  }
}

// Función para crear una partícula
function createParticule(x, y) {
  var p = {};
  p.x = x;
  p.y = y;

  // Asigna un color aleatorio a la partícula
  p.color = colors[anime.random(0, colors.length - 1)];

  // Asigna un radio aleatorio a la partícula
  p.radius = anime.random(16, 32);

  // Determina la posición final de la partícula
  p.endPos = setParticuleDirection(p);

  // Método para dibujar la partícula
  p.draw = function () {
    ctx.beginPath();
    ctx.arc(p.x, p.y, p.radius, 0, 2 * Math.PI, true);
    ctx.fillStyle = p.color;
    ctx.fill();
  }
  return p;
}

// Función para crear un círculo
function createCircle(x, y) {
  var p = {};
  p.x = x;
  p.y = y;
  p.color = '#FFF';
  p.radius = 0.1;
  p.alpha = .5;
  p.lineWidth = 6;

  // Método para dibujar el círculo
  p.draw = function () {
    ctx.globalAlpha = p.alpha;
    ctx.beginPath();
    ctx.arc(p.x, p.y, p.radius, 0, 2 * Math.PI, true);
    ctx.lineWidth = p.lineWidth;
    ctx.strokeStyle = p.color;
    ctx.stroke();
    ctx.globalAlpha = 1;
  }
  return p;
}

// Función para renderizar las partículas
function renderParticule(anim) {
  for (var i = 0; i < anim.animatables.length; i++) {
    anim.animatables[i].target.draw();
  }
}

// Función para animar las partículas
function animateParticules(x, y) {
  // Crea un círculo en la posición especificada
  var circle = createCircle(x, y);

  // Crea un array de partículas
  var particules = [];
  for (var i = 0; i < numberOfParticules; i++) {
    particules.push(createParticule(x, y));
  }

  // Añade la animación a la línea de tiempo de anime.js
  anime.timeline().add({
    targets: particules,
    x: function (p) { return p.endPos.x; },
    y: function (p) { return p.endPos.y; },
    radius: 0.1,
    duration: anime.random(1200, 1800),
    easing: 'easeOutExpo',
    update: renderParticule
  })
  .add({
    targets: circle,
    radius: anime.random(80, 160),
    lineWidth: 0,
    alpha: {
      value: 0,
      easing: 'linear',
      duration: anime.random(600, 800),
    },
    duration: anime.random(1200, 1800),
    easing: 'easeOutExpo',
    update: renderParticule
  }, 0);
}

// Animación infinita para limpiar el canvas
var render = anime({
  duration: Infinity,
  update: function () {
    ctx.clearRect(0, 0, canvasEl.width, canvasEl.height);
  }
});

// Evento para detectar la interacción del usuario y disparar los fuegos artificiales
document.addEventListener(tap, function (e) {
  window.human = true;
  render.play();
  updateCoords(e);
  animateParticules(pointerX, pointerY);
}, false);

// Coordenadas del centro de la ventana
var centerX = window.innerWidth / 2;
var centerY = window.innerHeight / 2;

// Configura el tamaño del canvas inicialmente y cuando se cambia el tamaño de la ventana
setCanvasSize();
window.addEventListener('resize', setCanvasSize, false);
