package com.fssa.pacapp.validation;
import com.fssa.pacapp.model.Packages;
import com.fssa.pacapp.validation.exceptions.InvalidPackageException;

public class PackagesValidator {

    public static void validatePackage(Packages packages) throws InvalidPackageException {
        if (packages == null) {
            throw new InvalidPackageException("Package is null");
        }
        
        if (!validateImageURL(packages.getImage())) {
            throw new InvalidPackageException("Image URL is not valid");
        }

        if (!validatePrice(packages.getPrice())) {
            throw new InvalidPackageException("Price is not valid");
        }

        if (!validateDescription(packages.getDescription())) {
            throw new InvalidPackageException("Description is not valid");
        }

        if (!validateDuration(packages.getDuration())) {
            throw new InvalidPackageException("Duration is not valid");
        }
    }

    public static boolean validateImageURL(String image) {
        if (image == null) {
            return false;
        }

        String regex = ".*\\.(jpg|jpeg|png|gif|JPG|JPEG|PNG|GIF)$";
        return image.matches(regex);
    }

    public static boolean validatePrice(int price) {
        String priceString = String.valueOf(price);
        return priceString.matches("^\\d{5}$");
    }

    public static boolean validateDescription(String description) {
        if (description == null) {
            return false;
        } 

        // Customize the regex pattern for description validation as needed
        String regex = "^[a-zA-Z0-9 .,'-]+$"; // Example pattern allowing letters, digits, and common punctuation
        return description.matches(regex);
    }

    public static boolean validateDuration(String duration) {
        if (duration == null) {
            return false;
        }

        String regex = "\\d+\\s*(?:days?|hours?|minutes?)";
        return duration.matches(regex);
    }
}
