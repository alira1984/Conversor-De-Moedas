# 💱 Conversor de Moedas em Java

Este projeto é um conversor de moedas em linha de comando desenvolvido em **Java**, utilizando a **ExchangeRate API** para obter taxas de câmbio em tempo real. O programa interage com o usuário via terminal, recebendo entrada com `Scanner`, realizando a conversão com base nas taxas atuais e exibindo o resultado.

---

## 🧰 Tecnologias utilizadas

- Java 
- Gson ( desserializar para JSON)  
- ExchangeRate API (https://www.exchangerate-api.com)  
- Scanner (entrada de dados via terminal)

---

## 📌 Funcionalidades

- Menu fixo com 7 opções de conversão:
1. Dólar → Peso Argentino
2. Peso Argentino → Dólar
3. Dólar → Real Brasileiro
4. Real Brasileiro → Dólar
5. Dólar → Peso Colombiano
6. Peso Colombiano → Dólar
7. Sair

- Entrada do valor a ser convertido pelo usuário
- Conexão com API para buscar a taxa de câmbio atualizada
- Conversão automática e exibição do resultado no terminal

---

## 🚀 Como executar

### 1. Clone o repositório
```bash
git clone https://github.com/alira1984/Conversor-De-Moedas.git
```


### 2. Obtenha uma chave da API
Crie uma conta gratuita em:

➡️ https://www.exchangerate-api.com

Copie sua chave de API e substitua em ServicoCambio.java na variável API_KEY.

```java
private final String API_KEY = "SUA_CHAVE_AQUI";
```
### 3. Compile e execute
Se estiver usando Intellij IDEA:

De um Run na classe ConversorMoedas.

### 4. Exemplo de uso

=== Conversor de Moedas ===
1) Dólar para Peso Argentino
2) Peso Argentino para Dólar
3) Dólar para Real brasileiro <br />
... <br />

Escolha uma opção para conversão de moeda: 3 <br />
Digite o valor a ser convertido: 100 <br />
O valor de 100,00 USD convertido para BRL é igual a 565,52 BRL <br />





