alert("Bem vindo ao jogo do número secreto");

let numMaximo = 100;
let numSecreto = parseInt(Math.random() * numMaximo + 1);

console.log(numSecreto);

let chute;
console.log("Valor do chute:", chute);

console.log("Resultado da comparação:", chute == numSecreto);

let tentativa = 1;

while (numSecreto != chute) {
	chute = prompt(`"Escolha um número entre 1 e ${numMaximo}`);
	if (numSecreto == chute) {
		break;
	} else {
		console.log("Valor do número secreto:", numSecreto);
		if (numSecreto > chute) {
			alert("é um número maior que " + chute);
		} else if (numSecreto < chute) {
			alert("é um número menor que " + chute);
		}
	}
	tentativa++;
}

let palavraTentativas = tentativa > 1 ? "tentativas" : "tentativa";

alert(
	`Parabens acertou o número ${chute} em ${tentativa} ${palavraTentativas}`
);
