# Padrões de Commits

Este projeto segue os padrões de commits convencionais em português brasileiro, baseados no repositório [padroes-de-commits](https://github.com/iuricode/padroes-de-commits).

## Formato do Commit

```
<tipo>[escopo opcional]: <descrição>

[corpo opcional]

[rodapé(s) opcional(is)]
```

## Tipos de Commit

| Tipo | Descrição |
|------|-----------|
| `feat` | Uma nova funcionalidade |
| `fix` | Correção de um bug |
| `docs` | Mudanças na documentação |
| `style` | Mudanças que não afetam o significado do código (espaços, formatação, etc) |
| `refactor` | Mudança de código que não corrige um bug nem adiciona uma funcionalidade |
| `perf` | Mudança de código que melhora a performance |
| `test` | Adicionando testes ausentes ou corrigindo testes existentes |
| `chore` | Mudanças no processo de build ou ferramentas auxiliares |
| `ci` | Mudanças nos arquivos e scripts de configuração de CI |
| `build` | Mudanças que afetam o sistema de build ou dependências externas |
| `revert` | Reverte um commit anterior |

## Exemplos

### Commits Simples
```
feat: adiciona validação de email
fix: corrige erro de divisão por zero
docs: atualiza README com instruções de instalação
style: remove espaços em branco desnecessários
refactor: reorganiza estrutura de pastas
test: adiciona testes para módulo de usuário
chore: atualiza dependências do projeto
```

### Commits com Escopo
```
feat(auth): adiciona sistema de login
fix(database): corrige conexão com PostgreSQL
docs(api): documenta endpoints de usuário
test(utils): adiciona testes para funções utilitárias
```

### Commits com Corpo e Rodapé
```
feat: adiciona sistema de notificações

Implementa um sistema completo de notificações push
para melhorar a experiência do usuário.

Closes #123
```

## Regras

1. **Use o imperativo**: "adiciona" não "adicionado" nem "adicionando"
2. **Não capitalize** a primeira letra da descrição
3. **Não termine** a descrição com ponto final
4. **Mantenha a primeira linha** com no máximo 50 caracteres
5. **Deixe uma linha em branco** entre o título e o corpo
6. **Use o corpo** para explicar "o que" e "por que", não "como"

## Como Usar

### Configuração Automática
O projeto já está configurado para usar o template de commit. Quando você executar `git commit`, o editor será aberto com o template pré-preenchido.

### Commit Manual
```bash
git add .
git commit -m "feat: adiciona nova funcionalidade"
```

### Usando o Template
```bash
git add .
git commit
# O editor será aberto com o template
```

## Benefícios

- **Padronização**: Todos os commits seguem o mesmo formato
- **Clareza**: Fácil identificação do tipo de mudança
- **Automação**: Possibilita geração automática de changelogs
- **Colaboração**: Facilita o trabalho em equipe
- **Histórico**: Histórico de commits mais limpo e organizados

## Ferramentas Recomendadas

- **Commitizen**: Para commits interativos
- **Conventional Changelog**: Para geração automática de changelogs
- **Husky**: Para hooks de Git
- **Commitlint**: Para validação de commits

## Referências

- [Padrões de Commits](https://github.com/iuricode/padroes-de-commits)
- [Conventional Commits](https://www.conventionalcommits.org/)
- [Semantic Versioning](https://semver.org/)