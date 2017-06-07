package com.altitudeinfosys.model;

/**
 * Created by tarek on 3/21/2017.
 */
public class RcCounty {
    private static final long serialVersionUID = 1L;

    private String cntyCd;
    private String cnty;
    private String contractR;
    private String regionCd;
    private String regionCity;

    /** Default constructor. */
    public RcCounty()
    {}

    /** Complete constructor. */
    public RcCounty(String cntyCd, String cnty, String contractR,
                    String regionCd, String regionCity)
    {
        this.cntyCd = cntyCd;
        this.cnty = cnty;
        this.contractR = contractR;
        this.regionCd = regionCd;
        this.regionCity = regionCity;
    }

    public String getCntyCd()
    {
        return this.cntyCd;
    }

    public String getCnty()
    {
        return this.cnty;
    }

    public String getContractR()
    {
        return this.contractR;
    }

    public String getRegionCd()
    {
        return this.regionCd;
    }

    public String getRegionCity()
    {
        return this.regionCity;
    }

    public void setCntyCd(String cntyCd)
    {
        this.cntyCd = cntyCd;
    }

    public void setCnty(String cnty)
    {
        this.cnty = cnty;
    }

    public void setContractR(String contractR)
    {
        this.contractR = contractR;
    }

    public void setRegionCd(String regionCd)
    {
        this.regionCd = regionCd;
    }

    public void setRegionCity(String regionCity)
    {
        this.regionCity = regionCity;
    }
}
