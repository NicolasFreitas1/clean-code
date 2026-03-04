# 01
class Funcionario:
    def calcularSalario(self, horasTrabalhadas, taxaPagamento):
        return horasTrabalhadas * taxaPagamento

funcionario = Funcionario()
print(funcionario.calcularSalario(40, 160))

# 02

def encontrarMaiorNumero(listaNumeros):
    numero = listaNumeros[0]
    for indice in listaNumeros:
        if indice > numero:
            numero = indice
    return numero

maiorNumero = encontrarMaiorNumero([3, 7, 2, 9, 4])
print("Maior número: ", maiorNumero)

# 03

def converterCelsiusParaFahrenheit(temperaturaCelsius):
    return (temperaturaCelsius * 9/5) + 32

temperaturaConvertida = converterCelsiusParaFahrenheit(25)
print("Temperatura em Fahrenheit: ", temperaturaConvertida)

# 04

def calcularAreaCirculo(raio):
    return 3.14 * (raio ** 2)

raio = 5
area = calcularRaio(raio)
print(area)

# 05

def encontrarMaiorNumeroPar(listaNumeros):
    maiorPar = None
    for numero in listaNumeros:
        if numero % 2 == 0 and (maiorPar is None or numero > maiorPar):
            maiorPar = numero
    return maiorPar

print(encontrarMaiorNumeroPar([3, 10, 7, 8, 15]))

# 06

def estaVazio(texto):
    return len(texto) == 0

texto = ""

print(estaVazio(texto))

# 07

def celsiusParaFahrenheit(temperaturaOriginal):
    return (temperaturaOriginal * 9/5) + 32

def fahrenheitParaCelsius(temperaturaOriginal):
    return (temperaturaOriginal - 32) * 5/9

temperaturaCelsius = 25
temperaturaFahrenheit = 77

print(celsiusParaFahrenheit(temperaturaCelsius))
print(fahrenheitParaCelsius(temperaturaFahrenheit))

# 08

def calcularMediaNotas(notas):
    return sum(notas) / len(notas)

def alunoFoiAprovado(media):
    return value(media) >= 60

notas = [70, 80, 50]
mediaDasNotas = calcularMediaNotas(notas)

print(aprovarAluno(notas))

# 09

class ContaBancaria:
    def __init__(self, titular, saldoInicial):
        self.titular = titular
        self.saldo = saldoInicial

    def depositar(self, valor):
        self.saldo += valor

    def sacar(self, valor):
        if valor <= self.saldo:
            self.saldo -= valor
        else:
            print("Saldo insuficiente")

    def obterSaldo(self):
        return self.saldo

    def resumoConta(self):
        return f"Conta: {self.titular}, Saldo: {self.saldo}"


def calcularSaldoTotal(listaContas):
    return sum(conta.Saldo for conta in listaContas)


def encontrarContaMaiorSaldo(listaContas):
    return max(listaContas, key=lambda conta: conta.saldo)


contaAlice = ContaBancaria("Alice", 500)
contaBob = ContaBancaria("Bob", 1200)
contaCharlie = ContaBancaria("Charlie", 700)

contaAlice.Depositar(200)
contaBob.Sacar(200)

print(contaAlice.ObterSaldo())
print(contaBob.ResumoConta())

listaContas = [contaAlice, contaBob, contaCharlie]

print(calcularSaldoTotal(listaContas))
print(encontrarContaMaiorSaldo(listaContas).titular)

# 10

diasDaSemana = [
    "Domingo",
    "Segunda",
    "Terça",
    "Quarta",
    "Quinta",
    "Sexta",
    "Sábado"
]

indiceDia = 2
diaEscolhido = diasDaSemana[indiceDia]

print(diaEscolhido)