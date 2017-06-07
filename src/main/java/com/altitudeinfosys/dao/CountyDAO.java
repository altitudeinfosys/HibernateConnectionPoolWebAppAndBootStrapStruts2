package com.altitudeinfosys.dao;

import com.altitudeinfosys.model.RcCounty;

/**
 * Created by tarek on 3/21/2017.
 */
public interface CountyDAO {

    RcCounty getCountyByCountyCode(String code);
    boolean saveCounty(RcCounty county);
    public boolean deleteCountyByCountyCode(String code);
    public boolean updateCountyByCountyCode(String code, String name);
}
