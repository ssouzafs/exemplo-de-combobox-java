
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author sergio
 */
public class Estado {

    private String descricao;
    private String sigla;
    private List<Cidade> cidades;

    public Estado(String descricao, List<Cidade> cidades) {
        this.descricao = descricao;
        this.cidades = cidades;
    }

    public Estado(String descricao, String sigla) {
        this.descricao = descricao;
        this.sigla = sigla;
        this.cidades = new LinkedList<>();
    }

    public void addCidade(Cidade cidade) {
        if (this.cidades != null) {
            this.cidades.add(cidade);
        }
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return descricao + " - " + sigla;
    }

}
