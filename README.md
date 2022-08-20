# DocBR
Validação de documentação brasileira, em Java.
Essa biblioteca permite que você valide documentos brasileiros facilmente.  

*Por enquanto, apenas a validação de CPF foi implementada.*

## Instalação
Basta clonar o repositório para o seu projeto, e manter apenas o pacote `org.docbr`.  

Ou baixe os arquivos manualmente na aba de `Releases`.

## Classes
`CPF(String cpf)`  

Recebe uma `string` equivalente a um CPF e o valida automaticamente.  
**Uso**:
```java
import org.docbr.CPF;

CPF cpf = new CPF("529.982.247-25")
// Ou
CPF cpf = new CPF("52998224725")

```

**Métodos**
```java
cpf.getCPF();
// retorna "52998224725"

cpf.getFormattedCPF()
// retorna "529.982.247-25"
```

Retorna a exceção `InputMismatchException` se o CPF não for válido.

No futuro, adicionarei a validação de outros documentos.
Por enquanto, não planejo adicionar ao repositório Maven.
