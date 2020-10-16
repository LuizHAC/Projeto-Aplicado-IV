/* 
Produzido por: Gabriel Nunes de Moraes Ghirardelli & Luiz Henrique Aguiar Campos
 */
/**
 * Author:  Gabriel Nunes de Moraes Ghirardelli & Luiz Henrique Aguiar Campos
 * Created: 15 de out. de 2020
 */

create database sistemaestoque;
use sistemaestoque;

-- -----------------------------------------------------
-- Tabela Usuarios
-- -----------------------------------------------------
create table Usuarios(
idUsuario int not null auto_increment,
UsuarioNome varchar(45) not null,
UsuarioSenha varchar(45) not null,
UsuarioTipo varchar(45) not null,
primary key (idUsuario)
);

-- -----------------------------------------------------
-- Tabela Fornecedores
-- -----------------------------------------------------
create table Fornecedores(
idFornecedor int not null auto_increment,
FornecedorEmpresa varchar(45) not null,
FornecedorRepresentante varchar(45),
FornecedorCNPJ int not null,
primary key (idFornecedor)
);

-- -----------------------------------------------------
-- Tabela Produtos
-- -----------------------------------------------------
create table Produtos(
idProduto int not null auto_increment,
ProdutoNome varchar(45) not null,
ProdutoValorCompra decimal(18,2) not null,
ProdutoValorVenda decimal(18,2) not null,
ProdutoDescricao varchar(250) not null,
ProdutoQuantidade int,
primary key (idProduto)
);

-- -----------------------------------------------------
-- Tabela Clientes
-- -----------------------------------------------------
create table Clientes(
idCliente int not null auto_increment,
ClienteNome varchar(45) not null,
ClienteCPF int not null,
ClienteUF varchar(2) not null,
ClienteCidade varchar(45) not null,
ClienteEndereço varchar(100) not null,
ClienteCredito decimal(18,2),
ClienteConta decimal(18,2),
primary key (idCliente)
);

-- -----------------------------------------------------
-- Tabela Compras
-- -----------------------------------------------------
create table Compras (
idCompra int not null auto_increment,
CompraValor decimal(18,2)not null,
CompraData date not null,
CompraIDFornecedor int not null,
CompraIDUsuario int not null,
primary key (idCompra),
constraint FK_Compra_Fornecedor foreign key (CompraIDFornecedor) references Fornecedores (idFornecedor),
constraint FK_Compra_Usuario foreign key (CompraIDUsuario)references Usuarios (idUsuario)
);

-- -----------------------------------------------------
-- Tabela Vendas
-- -----------------------------------------------------
create table Vendas (
idVenda int not null auto_increment,
VendaValor decimal(18,2) not null,
VendaData date not null,
VendaIDCliente int not null,
VendaIDUsuario int not null,
primary key (idVenda),
constraint FK_Venda_Cliente foreign key (VendaIDCliente) references Clientes (idCliente),
constraint FK_Venda_Usuario foreign key (VendaIDUsuario) references Usuarios (idUsuario)
);

-- -----------------------------------------------------
-- Tabela ItemsVendas
-- -----------------------------------------------------
create table ItemsVendas (
idItemVenda int not null auto_increment,
ItemIDProdutoVenda int not null,
ItemValorVenda decimal(18,2) NOT NULL,
ItemQuantidadeVenda int not null,
ItemIDVenda int not null,
primary key (idItemVenda),
constraint FK_ItemsVendas_Produto foreign key (ItemIDProdutoVenda) references Produtos (idProduto),
constraint FK_ItemsVendas_Venda foreign key (ItemIDVenda) references Vendas (idVenda)
);


-- -----------------------------------------------------
-- Tabela ItemsCompras
-- -----------------------------------------------------
create table ItemsCompras (
idItemCompra int not null auto_increment,
ItemIDProdutoCompra int not null,
ItemValorCompra decimal(18,2) NOT NULL,
ItemQuantidadeCompra int not null,
ItemIDCompra int not null,
primary key (idItemCompra),
constraint FK_ItemsCompras_Produto foreign key (ItemIDProdutoCompra) references Produtos (idProduto),
constraint FK_ItemsCompras_Compra foreign key (ItemIDCompra) references Compras (idCompra)
);

insert into Usuarios values (1,'Admin','Admin','Administrador');