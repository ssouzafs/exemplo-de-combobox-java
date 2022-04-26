
import java.util.LinkedList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author sergio
 */
public class EstadoComboBoxModel extends AbstractListModel<Estado> implements ComboBoxModel<Estado> {

    private List<Estado> dados;
    private Estado estadoSelecionado;

    public EstadoComboBoxModel() {
        this.dados = new LinkedList();
    }

    public EstadoComboBoxModel(List<Estado> dados) {
        this.dados = dados;
        
        if(getSize() > 0){
            this.setSelectedItem(this.dados.get(0));
        }
    }
    
    public void clear(){
        this.dados.clear();
        fireContentsChanged(this, 0, getSize() - 1);
    }

    @Override
    public int getSize() {
        return dados.size();
    }

    @Override
    public Estado getElementAt(int index) {
        return dados.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.estadoSelecionado = (Estado) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return this.estadoSelecionado;
    }

}
