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
			PackagesValidator.validatePackage(packages);
			if (packagesDAO.CreatePackeges(packages)) {
				return true;
			} else {
				System.out.println("not valid"); 
				return false;
			}

		} catch (DAOException | InvalidPackageException e) {
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
	
	
	public Packages getIdByObject(int id) throws ServiceException {
	    PackagesDAO packageDAO = new PackagesDAO();
	    try {
	        Packages packageList = packageDAO.getIdByObject(id);
	        return packageList;
	    } catch (DAOException e) {
	        throw new ServiceException(e);
	    }
	}
	
	public boolean updatePackageDetails(Packages updatedPackage) throws ServiceException {
		System.out.println(updatedPackage.toString());
		PackagesDAO packageDAO = new PackagesDAO();
	    try {
	        // Call the DAO method to update the package
	        boolean success = packageDAO.updatePackage(updatedPackage);

	        boolean updatepackage = true;
			// Return the result of the update operation
	        return updatepackage;
	    } catch (DAOException e) {
	        throw new ServiceException( e);
	    }
	}
	
	public boolean deletePackage(int packageId) throws ServiceException {
	    PackagesDAO packagesDAO = new PackagesDAO();
	    try {
	        // Call the DAO method to delete the package
	        boolean success = packagesDAO.deletePackage(packageId);

	        // Check if the deletion was successful
	        if (success) {
	            return true;
	        } else {
	            System.out.println("Deletion failed"); // You can replace this with appropriate logging
	            return false;
	        }
	    } catch (DAOException e) {
	        throw new ServiceException(e);
	    }
	}

	
	

	
	





}
