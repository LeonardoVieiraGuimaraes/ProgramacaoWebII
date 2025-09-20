let operacao = "";
let num1 = "";
let num2 = "";
let escolhendoNum2 = false;

function inserirNumero(numero) {
  if (!escolhendoNum2) {
    num1 += numero;
    atualizarDisplay(num1);
  } else {
    num2 += numero;
    atualizarDisplay(num2);
  }
}

function definirOperacao(op) {
  operacao = op;
  escolhendoNum2 = true;
}

function calcular() {
  let resultado = 0;
  const n1 = parseFloat(num1);
  const n2 = parseFloat(num2);

  switch (operacao) {
    case "+":
      resultado = n1 + n2;
      break;
    case "-":
      resultado = n1 - n2;
      break;
    case "*":
      resultado = n1 * n2;
      break;
    case "/":
      resultado = n1 / n2;
      break;
  }

  atualizarDisplay(resultado.toString());
  resetar();
}

function limparDisplay() {
  atualizarDisplay("");
  resetar();
}

function atualizarDisplay(valor) {
  document.getElementById("display").value = valor;
}

function resetar() {
  num1 = "";
  num2 = "";
  operacao = "";
  escolhendoNum2 = false;
}
