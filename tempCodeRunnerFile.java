firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        String normilizeF = firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        String normilizeL = lastName.substring(0,1).toUpperCase()+lastName.substring(1);
        String normalName = normilizeF + " " + normilizeL;