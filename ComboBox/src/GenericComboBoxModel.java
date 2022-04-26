
import java.util.LinkedList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author sergio
 */
public class GenericComboBoxModel<T> extends AbstractListModel<T> implements ComboBoxModel<T> {

    private List<T> dados;
    private T itemSelecionado;

    public GenericComboBoxModel() {
        this.dados = new LinkedList<>();
    }

    public GenericComboBoxModel(List<T> dados) {
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
    public T getElementAt(int index) {
        return dados.get(index);

    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.itemSelecionado = (T) anItem;
    }

    public void addListCidade(List<T> dados) {
        int primeiraLinha = getSize();
        this.dados.addAll(dados);
        fireIntervalAdded(this, primeiraLinha, this.dados.size() - 1);
        setSelectedItem(this.dados.get(getSize() - 1));
    }

    @Override
    public Object getSelectedItem() {
        return this.itemSelecionado;
    }

}
