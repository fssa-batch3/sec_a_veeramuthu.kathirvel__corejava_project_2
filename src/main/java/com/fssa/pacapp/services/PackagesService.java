  package com.fssa.pacapp.services;

import java.util.List;

import com.fssa.pacapp.dao.PackagesDAO;
import com.fssa.pacapp.dao.exception.DAOException;
import com.fssa.pacapp.model.Packages;
import com.fssa.pacapp.services.exceptions.ServiceException;
import com.fssa.pacapp.validation.PackagesValidator;
import com.fssa.pacapp.validation.exceptions.InvalidPackageException;

public class PackagesService {

	public boolean CreatePackages(Packages packages) throws ServiceException {
		PackagesDAO packagesDAO = new PackagesDAO();
		try {
			//PackagesValidator.validatePackage(packages);
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
	
	public List<Packages> readPackagesDetails() throws ServiceException {
	    PackagesDAO packageDAO = new PackagesDAO();
	    try {
	        List<Packages> packageList = packageDAO.readPackage();
	        return packageList;
	    } catch (DAOException e) {
	        throw new ServiceException(e);
	    }
	}





}
