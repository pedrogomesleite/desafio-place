
## Endpoints

### ContratoController

#### 1. Listar Contratos
- **URL:** `/contratos/list`
- **Método:** `GET`
- **Descrição:** Retorna uma lista de todos os contratos.
- **Parâmetros:** Nenhum
- **Respostas:**
  - **200 OK**
    ```json
    [
      {
        "id": 1,
        "devNome": "Nome do Desenvolvedor",
        "devNascimentoDate": "1990-01-01",
        "numRegistro": 123456789,
        "veiculos": [...]
      },
      {
        "id": 2,
        "devNome": "Outro Desenvolvedor",
        "devNascimentoDate": "1985-05-15",
        "numRegistro": 987654321,
        "veiculos": [...]
      }
    ]
    ```

#### 2. Obter Detalhes de um Contrato
- **URL:** `/contratos/{id}`
- **Método:** `GET`
- **Descrição:** Retorna os detalhes de um contrato específico.
- **Parâmetros:**
  - **URL:** `id` - ID do contrato a ser consultado
- **Respostas:**
  - **200 OK**
    ```json
    {
      "id": 1,
      "devNome": "Nome do Desenvolvedor",
      "devNascimentoDate": "1990-01-01",
      "numRegistro": 123456789,
      "veiculos": [...]
    }
    ```
  - **404 Not Found**
    ```json
    {
      "erro": "Contrato not found"
    }
    ```

#### 3. Criar um Contrato
- **URL:** `/contratos/save`
- **Método:** `POST`
- **Descrição:** Cria um novo contrato.
- **Parâmetros:**
  - **Corpo da Requisição (JSON):**
    ```json
    {
      "devNome": "Nome do Desenvolvedor",
      "devNascimentoDate": "1990-01-01",
      "numRegistro": 123456789,
      "veiculos": [...]
    }
    ```
- **Respostas:**
  - **201 Created**
    ```json
    {
      "id": 1,
      "devNome": "Nome do Desenvolvedor",
      "devNascimentoDate": "1990-01-01",
      "numRegistro": 123456789,
      "veiculos": [...]
    }
    ```

#### 4. Excluir um Contrato
- **URL:** `/contratos/{id}`
- **Método:** `DELETE`
- **Descrição:** Exclui um contrato existente.
- **Parâmetros:**
  - **URL:** `id` - ID do contrato a ser excluído
- **Respostas:**
  - **204 No Content**
  - **404 Not Found**
    ```json
    {
      "erro": "Contrato not found"
    }
    ```

#### 5. Atualizar um Contrato
- **URL:** `/contratos`
- **Método:** `PUT`
- **Descrição:** Atualiza um contrato existente.
- **Parâmetros:**
  - **Corpo da Requisição (JSON):**
    ```json
    {
      "id": 1,
      "devNome": "Nome do Desenvolvedor",
      "devNascimentoDate": "1990-01-01",
      "numRegistro": 123456789,
      "veiculos": [...]
    }
    ```
- **Respostas:**
  - **204 No Content**
  - **404 Not Found**
    ```json
    {
      "erro": "Contrato not found"
    }
    ```

#### 6. Adicionar Veículo a um Contrato
- **URL:** `/contratos/{id}`
- **Método:** `PUT`
- **Descrição:** Adiciona um veículo a um contrato existente.
- **Parâmetros:**
  - **URL:** `id` - ID do contrato
  - **Corpo da Requisição (JSON):**
    ```json
    {
      "id": 1,
      "numGrevame": 123456,
      "numRenavam": 654321,
      "numChassi": 987654,
      "placa": "ABC-1234"
    }
    ```
- **Respostas:**
  - **204 No Content**
  - **404 Not Found**
    ```json
    {
      "erro": "Contrato not found"
    }
    ```

### VeiculoController

#### 1. Listar Veículos
- **URL:** `/veiculos/list`
- **Método:** `GET`
- **Descrição:** Retorna uma lista de todos os veículos.
- **Parâmetros:** Nenhum
- **Respostas:**
  - **200 OK**
    ```json
    [
      {
        "id": 1,
        "numGrevame": 123456,
        "numRenavam": 654321,
        "numChassi": 987654,
        "placa": "ABC-1234"
      },
      {
        "id": 2,
        "numGrevame": 789012,
        "numRenavam": 210987,
        "numChassi": 654321,
        "placa": "XYZ-9876"
      }
    ]
    ```

#### 2. Obter Detalhes de um Veículo
- **URL:** `/veiculos/{id}`
- **Método:** `GET`
- **Descrição:** Retorna os detalhes de um veículo específico.
- **Parâmetros:**
  - **URL:** `id` - ID do veículo a ser consultado
- **Respostas:**
  - **200 OK**
    ```json
    {
      "id": 1,
      "numGrevame": 123456,
      "numRenavam": 654321,
      "numChassi": 987654,
      "placa": "ABC-1234"
    }
    ```
  - **404 Not Found**
    ```json
    {
      "erro": "Veículo not found"
    }
    ```

#### 3. Criar um Veículo
- **URL:** `/veiculos/save`
- **Método:** `POST`
- **Descrição:** Cria um novo veículo.
- **Parâmetros:**
  - **Corpo da Requisição (JSON):**
    ```json
    {
      "numGrevame": 123456,
      "numRenavam": 654321,
      "numChassi": 987654,
      "placa": "ABC-1234"
    }
    ```
- **Respostas:**
  - **201 Created**
    ```json
    {
      "id": 1,
      "numGrevame": 123456,
      "numRenavam": 654321,
      "numChassi": 987654,
      "placa": "ABC-1234"
    }

#### 4. Excluir um Veículo
- **URL:** `/veiculos/{id}`
- **Método:** `DELETE`
- **Descrição:** Exclui um veículo existente.
- **Parâmetros:**
  - **URL:** `id` - ID do veículo a ser excluído
- **Respostas:**
  - **204 No Content**
  - **404 Not Found**
    ```json
    {
      "erro": "Veículo not found"
    }
    ```

#### 5. Atualizar um Veículo
- **URL:** `/veiculos`
- **Método:** `PUT`
- **Descrição:** Atualiza um veículo existente.
- **Parâmetros:**
  - **Corpo da Requisição (JSON):**
    ```json
    {
      "id": 1,
      "numGrevame": 123456,
      "numRenavam": 654321,
      "numChassi": 987654,
      "placa": "ABC-1234"
    }
    ```
- **Respostas:**
  - **204 No Content**
  - **404 Not Found**
    ```json
    {
      "erro": "Veículo not found"
    }
    ```
"""
