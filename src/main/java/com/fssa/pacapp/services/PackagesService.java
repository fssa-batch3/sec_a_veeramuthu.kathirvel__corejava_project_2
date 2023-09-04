package com.fssa.pacapp.services;

import java.util.function.BooleanSupplier;

import com.fssa.pacapp.model.Packages;
import com.fssa.pacapp.services.exceptions.ServiceException;
import com.fssa.pacapp.validation.PackagesValidator;
import newapp.dao.PackagesDAO;
import newapp.dao.exception.DAOException;

public class PackagesService {

	public boolean CreatePackages(Packages packages) throws ServiceException {
		PackagesDAO packagesDAO = new PackagesDAO();
		try {
			PackagesValidator.validatePrice((CharSequence) packages);
			if (packagesDAO.CreatePackeges(packages)) {
				return true;
			} else {
				System.out.println("not valid");
				return false;
			}

		} catch (DAOException e) {
			throw new ServiceException(e);
		}

	}
	
	public boolean ListPackages (PackagesDAO packages) throws ServiceException {
        PackagesDAO packagesDAO = new PackagesDAO();
        try {
            return packagesDAO.listPackages();
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }


}
