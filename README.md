# 💱 Conversor de Moedas - Java

Este é um projeto em Java que realiza conversões de moedas em tempo real utilizando uma API de câmbio de moedas. O usuário escolhe entre opções de conversão (como BRL → USD, USD → EUR etc.), informa o valor, e o programa retorna o valor convertido com base na taxa atual da API.

---

## 🚀 Tecnologias utilizadas

- Java 17+
- Biblioteca `HttpClient` (para chamadas HTTP)
- API pública: [ExchangeRate API](https://www.exchangerate-api.com/)
- Biblioteca `Gson` (para conversão de JSON)
- Terminal (modo texto interativo)

---

## 📦 Estrutura do projeto

- `Main.java`: Classe principal que controla o menu e a interação com o usuário.
- `ConsultaMoeda.java`: Responsável por consultar a taxa de câmbio entre duas moedas.
- `Conversor.java`: Realiza o cálculo da conversão.
- `OpcaoMenu.java`: Fornece os códigos de moeda conforme a opção escolhida.
- `Moeda.java`: Record Java que representa o objeto retornado pela API.

---

## 🧪 Exemplo de uso

```bash

Digite o número da conversão que gostaria de fazer:
1: Real BRL  --> Dolar Americano USD;
2: Real BRL  --> Euro EUR
3: Dolar USD --> Real BRL
4: Dolar USD --> Euro EUR
5: Euro EUR --> Real BRL
6: Euro EUR --> Dolar Americano USD
7: Sair

> 1
Digite o valor da moeda que gostaria de converter?
> 100
O valor convertido é de: 17.63 USD

```

---

## 💻 Autor: Matheus Schalch
- `GitHub`: https://github.com/MSchalch
- `Linkedin`: www.linkedin.com/in/matheus-schalch-79aab6189
