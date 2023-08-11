package com.maroti.dataTables;

import com.maroti.model.Register;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class RegisterDataTable {

    @DataTableType
    public static Register register(Map<String, String> map){
        Register reg = new Register();
        reg.setFirstName(map.get("firstname"));
        reg.setLastName(map.get("lastname"));
        reg.setEmail(map.get("email"));
        reg.setPhone(map.get("phone"));
        reg.setAddress(map.get("address"));
        reg.setCity(map.get("city"));
        reg.setState(map.get("state"));
        reg.setPostalCode(map.get("postalCode"));
        reg.setCountry(map.get("country"));
        reg.setUsername(map.get("username"));
        reg.setPassword(map.get("password"));
        reg.setCnfPassword(map.get("cnfPassword"));
        return reg;
    }
}
