
package ciat.siscarMobile.services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "consultarValorTarifaCombustibleCALI", namespace = "http://services.siscarMobile.ciat/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarValorTarifaCombustibleCALI", namespace = "http://services.siscarMobile.ciat/")
public class ConsultarValorTarifaCombustibleCALI {

    @XmlElement(name = "arg0", namespace = "")
    private Long arg0;

    /**
     * 
     * @return
     *     returns Long
     */
    public Long getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Long arg0) {
        this.arg0 = arg0;
    }

}
