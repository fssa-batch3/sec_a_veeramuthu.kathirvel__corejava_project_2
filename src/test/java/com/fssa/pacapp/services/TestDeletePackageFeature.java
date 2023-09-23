package com.fssa.pacapp.services;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.fssa.pacapp.model.Packages;
import com.fssa.pacapp.services.exceptions.ServiceException;

public class TestDeletePackageFeature {

	@Test
	void testDeletePackageSuccess() {
		int packageIdToDelete = 12; // Provide the package ID you want to delete

		PackagesService service = new PackagesService();

		try {
			assertTrue(service.deletePackage(packageIdToDelete));
		} catch (ServiceException e) {
			e.printStackTrace();
			fail();
		}
	}
}
