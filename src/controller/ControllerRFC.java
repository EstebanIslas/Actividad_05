
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelRFC;
import view.ViewRFC;
import extras.DataValidationRFC;
public class ControllerRFC {
    ModelRFC modelRFC;
    ViewRFC viewRFC;
    DataValidationRFC dataValidationRFC = new DataValidationRFC();
    
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewRFC.jb_calcular)
                jb_calcular_action_Performed();
        }
    };

    public ControllerRFC(ModelRFC modelRFC, ViewRFC viewRFC) {
        this.modelRFC = modelRFC;
        this.viewRFC = viewRFC;
        initComponents();
        this.viewRFC.jb_calcular.addActionListener(actionListener);
    }
    public void jb_calcular_action_Performed(){
        modelRFC.setNombre(viewRFC.jtf_nombre.getText());
        modelRFC.setApellido_paterno((viewRFC.jtf_apellido_paterno.getText()));
        modelRFC.setApellido_materno(viewRFC.jtf_apellido_materno.getText());
        modelRFC.setDia(viewRFC.jtf_dia.getText());
        modelRFC.setMes(viewRFC.jtf_mes.getText());
        modelRFC.setAnio(viewRFC.jtf_anio.getText());
        
        if(modelRFC.getDia().length() <= 1){
            modelRFC.setDia("0"+String.valueOf(viewRFC.jtf_dia.getText()));
        }
        if(modelRFC.getMes().length() <= 1){
            modelRFC.setMes("0"+String.valueOf(viewRFC.jtf_mes.getText()));
        }
        
        viewRFC.jl_resultado.setText(String.valueOf(modelRFC.Ape_Pat()) + String.valueOf(modelRFC.Ape_Mat()) + String.valueOf(modelRFC.Nombre()) + String.valueOf(modelRFC.getDia()) + String.valueOf(modelRFC.getMes()) + String.valueOf(modelRFC.getAnio()));
    }
    public void initComponents() {
        viewRFC.setVisible(true);
        viewRFC.setLocationRelativeTo(null);
    }
}
