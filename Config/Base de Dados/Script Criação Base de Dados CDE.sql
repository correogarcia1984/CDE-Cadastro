USE [master]
GO
/****** Object:  Database [CDE]    Script Date: 20/4/2019 12:22:32 ******/
CREATE DATABASE [CDE]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'CDE', FILENAME = N'C:\CDE\CDE.mdf' , SIZE = 5120KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'CDE_log', FILENAME = N'C:\CDE\CDE_log.ldf' , SIZE = 2048KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [CDE] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [CDE].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [CDE] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [CDE] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [CDE] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [CDE] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [CDE] SET ARITHABORT OFF 
GO
ALTER DATABASE [CDE] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [CDE] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [CDE] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [CDE] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [CDE] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [CDE] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [CDE] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [CDE] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [CDE] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [CDE] SET  DISABLE_BROKER 
GO
ALTER DATABASE [CDE] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [CDE] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [CDE] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [CDE] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [CDE] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [CDE] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [CDE] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [CDE] SET RECOVERY FULL 
GO
ALTER DATABASE [CDE] SET  MULTI_USER 
GO
ALTER DATABASE [CDE] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [CDE] SET DB_CHAINING OFF 
GO
ALTER DATABASE [CDE] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [CDE] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [CDE] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'CDE', N'ON'
GO
USE [CDE]
GO
/****** Object:  Table [dbo].[T01Clientes]    Script Date: 20/4/2019 12:22:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[T01Clientes](
	[C01NumReg] [numeric](10, 0) NOT NULL,
	[C01Rg] [nvarchar](9) NOT NULL CONSTRAINT [DF_Table_1_C01RgCli]  DEFAULT ((0)),
	[C01Cpf] [nvarchar](14) NOT NULL,
	[C01Nom] [nvarchar](50) NOT NULL,
	[C01Sex] [nvarchar](15) NOT NULL,
	[C01DatNac] [date] NOT NULL,
	[C01Cep] [nvarchar](9) NOT NULL,
	[C01End] [nvarchar](50) NULL,
	[C01Ati] [char](3) NOT NULL CONSTRAINT [DF_T01Clientes_C01Ati]  DEFAULT ('Si'),
	[C01Obs] [nvarchar](200) NULL,
	[C01DatCad] [date] NOT NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[T02Usuarios]    Script Date: 20/4/2019 12:22:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[T02Usuarios](
	[C02IdeUsu] [numeric](10, 0) NOT NULL,
	[C02NomUsu] [nvarchar](50) NOT NULL,
	[C02SenUsu] [nvarchar](10) NOT NULL
) ON [PRIMARY]

GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Consecutivo de Registro' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'T01Clientes', @level2type=N'COLUMN',@level2name=N'C01NumReg'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Carteira de Identidade do Cliente' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'T01Clientes', @level2type=N'COLUMN',@level2name=N'C01Rg'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'CPF do Cliente' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'T01Clientes', @level2type=N'COLUMN',@level2name=N'C01Cpf'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Nome do Cliente' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'T01Clientes', @level2type=N'COLUMN',@level2name=N'C01Nom'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Sexo do Cliente' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'T01Clientes', @level2type=N'COLUMN',@level2name=N'C01Sex'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Data de Nacimento do Cliente' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'T01Clientes', @level2type=N'COLUMN',@level2name=N'C01DatNac'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Cep de Endereco do Cliente' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'T01Clientes', @level2type=N'COLUMN',@level2name=N'C01Cep'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Endereco do Cliente' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'T01Clientes', @level2type=N'COLUMN',@level2name=N'C01End'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Cliente Ativo' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'T01Clientes', @level2type=N'COLUMN',@level2name=N'C01Ati'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Observacao do Cliente' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'T01Clientes', @level2type=N'COLUMN',@level2name=N'C01Obs'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Data de Cadastro do Cliente' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'T01Clientes', @level2type=N'COLUMN',@level2name=N'C01DatCad'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Identidade do Usuario de la DB' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'T02Usuarios', @level2type=N'COLUMN',@level2name=N'C02IdeUsu'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Nome Usuario do DB' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'T02Usuarios', @level2type=N'COLUMN',@level2name=N'C02NomUsu'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Senhal do Usuario da DB' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'T02Usuarios', @level2type=N'COLUMN',@level2name=N'C02SenUsu'
GO
USE [master]
GO
ALTER DATABASE [CDE] SET  READ_WRITE 
GO
