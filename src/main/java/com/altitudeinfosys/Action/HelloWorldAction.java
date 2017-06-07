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
public class HelloWorldAction implements Action, ModelDriven<RcCounty>, ServletContextAware {

    private String name;
    private String countyCode;
    private String countyName;

    //get log4j
    private static final Logger logger = Logger.getLogger(HelloWorldAction.class);


    @Override
    public RcCounty getModel() {
        return county;
    }

    private RcCounty county = new RcCounty();

    private ServletContext ctx;

    @Override
    public void setServletContext(ServletContext sc) {
        this.ctx = sc;
    }

    public String execute() throws Exception {

        // logs debug message
        if (logger.isDebugEnabled()) {
            logger.debug("execute()!");
        }

        // logs exception
        logger.error("This is Error message", new Exception("Testing"));

        SessionFactory sf = (SessionFactory) ctx.getAttribute("SessionFactory");
        CountyDAO countyDAO = new CountyDAOImpl(sf);
        RcCounty countyDB = countyDAO.getCountyByCountyCode(countyCode);
        if(countyDB == null) return ERROR;
        else {
            countyName = countyDB.getCnty();
            return SUCCESS;
        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
}