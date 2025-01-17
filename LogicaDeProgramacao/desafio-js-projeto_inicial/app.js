alert("Boas vindas ao nosso site!")

let nome = "Lua"
let idade = 25
let numeroDeVendas = 50
let saldoDisponivel = 1000

let mensagemDeErro = "Erro! Preencha todos os campos"
alert(mensagemDeErro)

nome = prompt("Insira seu nome: ")

idade = prompt("Insira sua idade: ")

if(idade >= 18){
    alert("Pode tirar a habilitação!")
}
