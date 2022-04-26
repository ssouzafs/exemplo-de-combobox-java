
import java.util.LinkedList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author sergio
 */
public class CidadeComboBoxModel extends AbstractListModel<Cidade> implements ComboBoxModel<Cidade> {

    private List<Cidade> dados;
    private Cidade cidadeSelecionada;

    public CidadeComboBoxModel() {
        this.dados = new LinkedList();
    }

    public CidadeComboBoxModel(List<Cidade> dados) {
        this.dados = dados;

        if (getSize() > 0) {
            this.setSelectedItem(this.dados.get(0));
        }
    }

    public void clear() {
        this.dados.clear();
        fireContentsChanged(this, 0, getSize() - 1);
    }

    @Override
    public int getSize() {
        return dados.size();
    }

    @Override
    public Cidade getElementAt(int index) {
        return dados.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
         this.cidadeSelecionada = (Cidade) anItem;
    }
    
    public void addListCidade(List<Cidade> cidades){
        
        int primeiraLinha = getSize();
        this.dados.addAll(cidades);
        fireIntervalAdded(this, primeiraLinha, this.dados.size() -1);
        setSelectedItem(this.dados.get(getSize() - 1));
    }

    @Override
    public Object getSelectedItem() {
        return this.cidadeSelecionada;
    }


}
