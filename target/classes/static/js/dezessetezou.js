function Inicio(){
    const texto = document.querySelector("h1");
    const textos = document.querySelector("h5");
    const img = document.querySelector("img");

    texto.innerHTML = "Bem-Vindos ao site sobre nosso projeto final 👩‍💻👩‍💻👩‍💻👩‍💻";
    textos.innerHTML = "Nesse projeto, vamos desenvolver um jogo (realizado no GreenFoot), um site e um Banco de Dados (realizado no SpringTools)";
    img.setAttribute("src","./img/monstrossa.jpg");
    img.setAttribute("height","300px");
}
function Historia(){
    const texto = document.querySelector("h1");
    const textos = document.querySelector("h5");
    const imagem = document.querySelector("img");

    texto.innerHTML = "História";
    textos.innerHTML = "Mike e Sullivan estavam planejando um churrasco com piscina do jeito que a Boo mais gosta, quando derrepente eles percebem que Boo havia sumido, ajude eles a encontrar Boo para que o churrasco possa acontecer.";
    imagem.setAttribute("src","./img/intro.png");
    imagem.setAttribute("height","300px");
}
function Personagens(){
    const texto = document.querySelector("h1");
    const textos = document.querySelector("h5");
    const image = document.querySelector("img");

    texto.innerHTML = "Personagens";
    textos.innerHTML = " -Mike  -Sullivan  -Boo   -Randall"
    image.setAttribute("src","./img/monstros.png");
    image.setAttribute("height","300px");
}

function Comandos(){
    const texto = document.querySelector("h1");
    const text = document.querySelector("h5");
    const imagem = document.querySelector("img");

    texto.innerHTML = "Comandos";
    text.innerHTML = "Em nosso jogo nós utilizamos as teclas direcionais para movimentar os personagens, sendo 🔼 - andar para frente, 🔽 - andar para trás, ◀ - andar para a esquerda e ▶ - andar para a direita";
    imagem.setAttribute("src","./img/teclas.png");
    imagem.setAttribute("height","300px");
}
function Squad(){
    const texto = document.querySelector("h1");
    const textos = document.querySelector("h5");
    const imagem = document.querySelector("img");

    texto.innerHTML = "Squad";
    textos.innerHTML = "Integrantes do grupo: "
    imagem.setAttribute("src","./img/nomes.png");
    imagem.setAttribute("height","300px");
}
