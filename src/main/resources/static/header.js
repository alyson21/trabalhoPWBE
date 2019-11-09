var header =
`
<nav class="navbar navbar-expand-lg  navbar-light bg-light">     
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item dropdown">
                <a class="nav-link text-dark dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Início
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Tela Principal</a>
                    <a class="dropdown-item" href="#">Ajuda</a>
                    <a class="dropdown-item" href="#">Relatar Problema</a>                   
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">Trocar Usuário</a>
                <a class="dropdown-item" href="#">Sair</a>
                </div>
            </li>

            <li class="nav-item dropdown">
                <a class="nav-link text-dark dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Funcionários
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Inserir Funcionário</a>
                    <a class="dropdown-item" href="#">Alterar Cadastro</a>
                    <a class="dropdown-item" href="#">Cadastrar Demissão</a>
                </div>
            </li>

            <li class="nav-item-dark dropdown">
                <a class="nav-link text-dark dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Setor
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Cadastrar</a>
                    <a class="dropdown-item" href="#">Alterar</a>
                    <a class="dropdown-item" href="#">Excluir</a>
                </div>
            </li>

            <li class="nav-item-dark dropdown">
                <a class="nav-link text-dark dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Salário
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Cadastrar</a>
                    <a class="dropdown-item" href="#">Alterar</a>
                    <a class="dropdown-item" href="#">Excluir</a>
                </div>
            </li>

            <li class="nav-item-dark dropdown">
                <a class="nav-link text-dark dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Cargo
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Cadastrar</a>
                    <a class="dropdown-item" href="#">Alterar</a>
                    <a class="dropdown-item" href="#">Excluir</a>
                </div>
            </li>


            <li class="nav-item dropdown">
                <a class="nav-link text-dark dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Cálculos
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Calcular folha de pagamento</a>
                    <a class="dropdown-item" href="#">Retificar folha de pagamento</a>
                </div>
            </li>

            <li class="nav-item dropdown">
                <a class="nav-link text-dark dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Descontos
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Cadastrar desconto</a>
                    <a class="dropdown-item" href="#">Inserir desconto em massa</a>
                    <a class="dropdown-item" href="#">Inserir desconto individual</a>
                    <a class="dropdown-item" href="#">Alterar desconto</a>
                </div>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link text-dark dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Proventos
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Cadastrar Proventos</a>
                    <a class="dropdown-item" href="#">Inserir Provento em massa</a>
                    <a class="dropdown-item" href="#">Inserir Provento individual</a>
                    <a class="dropdown-item" href="#">Alterar Provento</a>
                </div>
            </li>

            <li class="nav-item dropdown">
                    <a class="nav-link text-dark dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Controle de acesso
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#">Cadastrar Usuário</a>
                        <a class="dropdown-item" href="#">Alterar Usuário</a>
                        <a class="dropdown-item" href="#">Inserir Perfil de Acesso</a>
                        <a class="dropdown-item" href="#">Alterar Perfil de Acesso</a>
                    </div>
                </li>
        </ul>
    </div>
  </nav>
  `
  
$(function () {
	$("#header").html(header);
});







