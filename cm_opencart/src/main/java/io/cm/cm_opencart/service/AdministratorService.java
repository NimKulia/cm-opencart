package io.cm.cm_opencart.service;

import io.cm.cm_opencart.po.Administrator;

public interface AdministratorService {

    Administrator getByUsername(String username);
}
