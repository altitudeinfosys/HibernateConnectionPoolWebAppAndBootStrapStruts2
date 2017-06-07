package com.altitudeinfosys.Action;

import com.altitudeinfosys.dao.CountyDAO;
import com.altitudeinfosys.dao.CountyDAOImpl;
import com.altitudeinfosys.model.RcCounty;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.log4j.Logger;
import org.apache.struts2.util.ServletContextAware;
import org.hibernate.SessionFactory;

import javax.servlet.ServletContext;

/**
 * Created by tarek on 3/20/2017.
 */
public class CountyAction implements Action, ModelDriven<RcCounty>, ServletContextAware {

    //get log4j
    private static final Logger logger = Logger.getLogger(CountyAction.class);

    private String name;
    private RcCounty county = new RcCounty();



    @Override
    public RcCounty getModel() {
        return county;
    }

    private ServletContext ctx;

    @Override
    public void setServletContext(ServletContext sc) {
        this.ctx = sc;
    }


    public String saveCounty() throws Exception {

        SessionFactory sf = (SessionFactory) ctx.getAttribute("SessionFactory");
        CountyDAO countyDAO = new CountyDAOImpl(sf);
        if (countyDAO.saveCounty(county))
            return SUCCESS;
        else
            return ERROR;

    }

    public String deleteCounty() throws Exception {

        SessionFactory sf = (SessionFactory) ctx.getAttribute("SessionFactory");
        CountyDAO countyDAO = new CountyDAOImpl(sf);
        if (countyDAO.deleteCountyByCountyCode(county.getCntyCd()))
            return SUCCESS;
        else
            return ERROR;

    }

    public String updateCounty() throws Exception {

        SessionFactory sf = (SessionFactory) ctx.getAttribute("SessionFactory");
        CountyDAO countyDAO = new CountyDAOImpl(sf);
        if (countyDAO.updateCountyByCountyCode(county.getCntyCd(), county.getCnty()))
            return SUCCESS;
        else
            return ERROR;

    }




    public String findCounty() throws Exception{

        // logs debug message
        if (logger.isDebugEnabled()) {
            logger.debug("execute()!");
        }

        // logs exception
        logger.error("This is Error message", new Exception("Testing"));

        SessionFactory sf = (SessionFactory) ctx.getAttribute("SessionFactory");
        CountyDAO countyDAO = new CountyDAOImpl(sf);
        RcCounty countyDB = countyDAO.getCountyByCountyCode(county.getCntyCd());
        if(countyDB == null) return ERROR;
        else {
            county.setCnty(countyDB.getCnty());
            return SUCCESS;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute(){
        return SUCCESS;
    }
}