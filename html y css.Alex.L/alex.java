const audio = document.getElementById("miMusica");
const boton = document.getElementById("btnControl");

// Opcional: Define el volumen inicial (0.0 a 1.0)
audio.volume = 0.4; 

boton.addEventListener("click", () => {
    if (audio.paused) {
        audio.play();
        boton.innerHTML = "⏸️ Pausar";
        boton.classList.add("activo"); // Para cambiar el diseño con CSS si quieres
    } else {
        audio.pause();
        boton.innerHTML = "▶️ Reproducir";
        boton.classList.remove("activo");
    }
});