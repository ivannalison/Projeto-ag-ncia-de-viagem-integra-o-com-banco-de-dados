
package aplicajvbanco;

import java.util.Date;

public class ClassCidade {
     private int cidadeId;
    private String nomeCidade;

    public int getCidadeId() {
        return cidadeId;
    }

    public void setCidadeId(int cidadeId) {
        this.cidadeId = cidadeId;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    
public class Cliente {
    private int clienteId;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private String cartaoCredito;
    private Date dataNascimento; 

        public int getClienteId() {
            return clienteId;
        }

        public void setClienteId(int clienteId) {
            this.clienteId = clienteId;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public String getCartaoCredito() {
            return cartaoCredito;
        }

        public void setCartaoCredito(String cartaoCredito) {
            this.cartaoCredito = cartaoCredito;
        }

        public Date getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(Date dataNascimento) {
            this.dataNascimento = dataNascimento;
        }
    }

public class Compra {
    private int compraId;
    private Date dataCompra;
    private float valorTotal;
    private String metodoPagamento;
    private int clienteId;

        public int getCompraId() {
            return compraId;
        }

        public void setCompraId(int compraId) {
            this.compraId = compraId;
        }

        public Date getDataCompra() {
            return dataCompra;
        }

        public void setDataCompra(Date dataCompra) {
            this.dataCompra = dataCompra;
        }

        public float getValorTotal() {
            return valorTotal;
        }

        public void setValorTotal(float valorTotal) {
            this.valorTotal = valorTotal;
        }

        public String getMetodoPagamento() {
            return metodoPagamento;
        }

        public void setMetodoPagamento(String metodoPagamento) {
            this.metodoPagamento = metodoPagamento;
        }

        public int getClienteId() {
            return clienteId;
        }

        public void setClienteId(int clienteId) {
            this.clienteId = clienteId;
        }

}
public class Destino {
    private int cidadeId;
    private int viagemId;

        public int getCidadeId() {
            return cidadeId;
        }

        public void setCidadeId(int cidadeId) {
            this.cidadeId = cidadeId;
        }

        public int getViagemId() {
            return viagemId;
        }

        public void setViagemId(int viagemId) {
            this.viagemId = viagemId;
        }

    
}
public class Documento {
    private int documentoId;
    private String tipoDocumento;
    private int numeroDocumento;
    private Date dataExpiracao;
    private int clienteId;

        public int getDocumentoId() {
            return documentoId;
        }

        public void setDocumentoId(int documentoId) {
            this.documentoId = documentoId;
        }

        public String getTipoDocumento() {
            return tipoDocumento;
        }

        public void setTipoDocumento(String tipoDocumento) {
            this.tipoDocumento = tipoDocumento;
        }

        public int getNumeroDocumento() {
            return numeroDocumento;
        }

        public void setNumeroDocumento(int numeroDocumento) {
            this.numeroDocumento = numeroDocumento;
        }

        public Date getDataExpiracao() {
            return dataExpiracao;
        }

        public void setDataExpiracao(Date dataExpiracao) {
            this.dataExpiracao = dataExpiracao;
        }

        public int getClienteId() {
            return clienteId;
        }

        public void setClienteId(int clienteId) {
            this.clienteId = clienteId;
        }
    }

public class Feedback {
    private int feedbackId;
    private String avaliacao;
    private String comentarios;
    private Date dataFeedback;

        public int getFeedbackId() {
            return feedbackId;
        }

        public void setFeedbackId(int feedbackId) {
            this.feedbackId = feedbackId;
        }

        public String getAvaliacao() {
            return avaliacao;
        }

        public void setAvaliacao(String avaliacao) {
            this.avaliacao = avaliacao;
        }

        public String getComentarios() {
            return comentarios;
        }

        public void setComentarios(String comentarios) {
            this.comentarios = comentarios;
        }

        public Date getDataFeedback() {
            return dataFeedback;
        }

        public void setDataFeedback(Date dataFeedback) {
            this.dataFeedback = dataFeedback;
        }

   
}
public class Promocao {
    private int promocaoId;
    private String nome;
    private String descricao;
    private float descontoPercentual;
    private Date dataInicio;
    private Date dataFim;

        public int getPromocaoId() {
            return promocaoId;
        }

        public void setPromocaoId(int promocaoId) {
            this.promocaoId = promocaoId;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public float getDescontoPercentual() {
            return descontoPercentual;
        }

        public void setDescontoPercentual(float descontoPercentual) {
            this.descontoPercentual = descontoPercentual;
        }

        public Date getDataInicio() {
            return dataInicio;
        }

        public void setDataInicio(Date dataInicio) {
            this.dataInicio = dataInicio;
        }

        public Date getDataFim() {
            return dataFim;
        }

        public void setDataFim(Date dataFim) {
            this.dataFim = dataFim;
        }

}

public class Reserva {
    private int reservaId;
    private int numeroPessoas;
    private int statusPagamento;
    private Date dataReserva;
    private int clienteId;

        public int getReservaId() {
            return reservaId;
        }

        public void setReservaId(int reservaId) {
            this.reservaId = reservaId;
        }

        public int getNumeroPessoas() {
            return numeroPessoas;
        }

        public void setNumeroPessoas(int numeroPessoas) {
            this.numeroPessoas = numeroPessoas;
        }

        public int getStatusPagamento() {
            return statusPagamento;
        }

        public void setStatusPagamento(int statusPagamento) {
            this.statusPagamento = statusPagamento;
        }

        public Date getDataReserva() {
            return dataReserva;
        }

        public void setDataReserva(Date dataReserva) {
            this.dataReserva = dataReserva;
        }

        public int getClienteId() {
            return clienteId;
        }

        public void setClienteId(int clienteId) {
            this.clienteId = clienteId;
        }

    
}
public class Viagem {
    private int viagemId;
    private String destino;
    private Date dataPartida;
    private float preco;
    private Date duracao;
    private String avaliacao;
    private int compraId;
    private int clienteId;

        public int getViagemId() {
            return viagemId;
        }

        public void setViagemId(int viagemId) {
            this.viagemId = viagemId;
        }

        public String getDestino() {
            return destino;
        }

        public void setDestino(String destino) {
            this.destino = destino;
        }

        public Date getDataPartida() {
            return dataPartida;
        }

        public void setDataPartida(Date dataPartida) {
            this.dataPartida = dataPartida;
        }

        public float getPreco() {
            return preco;
        }

        public void setPreco(float preco) {
            this.preco = preco;
        }

        public Date getDuracao() {
            return duracao;
        }

        public void setDuracao(Date duracao) {
            this.duracao = duracao;
        }

        public String getAvaliacao() {
            return avaliacao;
        }

        public void setAvaliacao(String avaliacao) {
            this.avaliacao = avaliacao;
        }

        public int getCompraId() {
            return compraId;
        }

        public void setCompraId(int compraId) {
            this.compraId = compraId;
        }

        public int getClienteId() {
            return clienteId;
        }

        public void setClienteId(int clienteId) {
            this.clienteId = clienteId;
        }

}
public class ViagemFeedback {
    private int feedbackId;
    private int viagemId;

        public int getFeedbackId() {
            return feedbackId;
        }

        public void setFeedbackId(int feedbackId) {
            this.feedbackId = feedbackId;
        }

        public int getViagemId() {
            return viagemId;
        }

        public void setViagemId(int viagemId) {
            this.viagemId = viagemId;
        }

    
}
public class ClienteFeedback {
    private int clienteId;
    private int feedbackId;

        public int getClienteId() {
            return clienteId;
        }

        public void setClienteId(int clienteId) {
            this.clienteId = clienteId;
        }

        public int getFeedbackId() {
            return feedbackId;
        }

        public void setFeedbackId(int feedbackId) {
            this.feedbackId = feedbackId;
        }

}
public class Contato {
    private int contatoId;
    private String tipoTelefone;
    private String tipoEmail;
    private int clienteId;

        public int getContatoId() {
            return contatoId;
        }

        public void setContatoId(int contatoId) {
            this.contatoId = contatoId;
        }

        public String getTipoTelefone() {
            return tipoTelefone;
        }

        public void setTipoTelefone(String tipoTelefone) {
            this.tipoTelefone = tipoTelefone;
        }

        public String getTipoEmail() {
            return tipoEmail;
        }

        public void setTipoEmail(String tipoEmail) {
            this.tipoEmail = tipoEmail;
        }

        public int getClienteId() {
            return clienteId;
        }

        public void setClienteId(int clienteId) {
            this.clienteId = clienteId;
        }

}
public class ReservaCidade {
    private int reservaId;
    private int cidadeId;

        public int getReservaId() {
            return reservaId;
        }

        public void setReservaId(int reservaId) {
            this.reservaId = reservaId;
        }

        public int getCidadeId() {
            return cidadeId;
        }

        public void setCidadeId(int cidadeId) {
            this.cidadeId = cidadeId;
        }

}
public class TemPromocao {
    private int promocaoId;
    private int viagemId;

        public int getPromocaoId() {
            return promocaoId;
        }

        public void setPromocaoId(int promocaoId) {
            this.promocaoId = promocaoId;
        }

        public int getViagemId() {
            return viagemId;
        }

        public void setViagemId(int viagemId) {
            this.viagemId = viagemId;
        }

    
}
public class ViagemReserva {
    private int reservaId;
    private int viagemId;

        public int getReservaId() {
            return reservaId;
        }

        public void setReservaId(int reservaId) {
            this.reservaId = reservaId;
        }

        public int getViagemId() {
            return viagemId;
        }

        public void setViagemId(int viagemId) {
            this.viagemId = viagemId;
        }

    
}



}

