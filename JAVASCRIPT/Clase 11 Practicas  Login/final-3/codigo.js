document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Evitar el envío del formulario

    // Obtener los valores de los campos de entrada
    const username = document.getElementById('username').value.trim();
    const password = document.getElementById('password').value.trim();

    // Obtener los elementos de error
    const usernameError = document.getElementById('usernameError');
    const passwordError = document.getElementById('passwordError');

    // Restablecer los mensajes de error
    usernameError.textContent = '';
    passwordError.textContent = '';

    let formIsValid = true;

    // Validar el campo de nombre de usuario
    if (username === '') {
        usernameError.textContent = 'Username is required.';
        formIsValid = false;
    }

    // Validar el campo de contraseña
    if (password === '') {
        passwordError.textContent = 'Password is required.';
        formIsValid = false;
    }

    // Si el formulario es válido, enviarlo
    if (formIsValid) {
        
        
        alert('Form submitted successfully!');
    }
});
