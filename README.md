# Handling-Exceptions

Um modelo de tratamento de exceções proporciona uma abordagem consistente e flexível para lidar com erros, seguindo as melhores práticas.

-----

- Cláusula **throw**: lança a exceção
- Cláusula **throws**: propaga a exceção ao invés de trata-la

- **RuntimeException**: compilador não obriga tratar
- **Exception**: compilador obriga a tratar ou propagar

> **Dica: propagar a exceção nos outros métodos filhos (usando throws na assinatura) e a exception só ser tratada no método principal/pai (Try/Catch).**

----

### Programação defensiva
  É uma abordagem de desenvolvimento de software que se concentra na prevenção de erros e na mitigação de riscos, focado em validar as entradas, ter um tratamento apropriado de exceções e a adoção de boas práticas para tornar o software mais resistente e confiável.

  
  #### Exemplos de técnicas de programação defensiva:

  ##### 1. Validação de Entradas: Verificar e validar todas as entradas de dados, como parâmetros de funções, entradas de usuário, dados de arquivos, para garantir que atendam aos critérios e limites esperados. 
  
  - Exemplo: Verificar se um número fornecido é positivo antes de usá-lo em cálculos.
  
  ##### 2. Verificação de Nulos (Null Checks): Verificar se uma referência não é nula antes de tentar acessar seus membros (métodos ou atributos) para evitar exceções de NullPointerException.

  ##### 3. Manuseio de Exceções: Implementar tratamento de exceções para lidar com erros de forma adequada, tomando medidas corretivas ou mostrando mensagens de erro claras para o usuário. 
  
  - Exemplo: Usar blocos try-catch para capturar exceções e fornecer mensagens de erro significativas.

  ##### 4. Testes Adequados: Realizar testes extensivos, incluindo testes de unidade, testes de integração e testes de aceitação, para garantir que o software funcione conforme o esperado e que as falhas sejam identificadas e tratadas.

  ##### 5. Limitação de Escopo: Manter funções e métodos com responsabilidades bem definidas e limitadas, evitando que façam muitas coisas ao mesmo tempo, pois assim pode levar a um código mais complexo e propenso a erros. 
  
 -  Exemplo: Evitar funções que realizam muitas tarefas e, em vez disso, dividir o código em funções menores e mais específicas.

  ##### 6. Documentação Adequada: Fornecer documentação clara e concisa do código, incluindo informações sobre como usá-lo corretamente e quais exceções podem ocorrer.
