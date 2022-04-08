public class Functions {

    public void saveIncome(Income income){
        inRepo.save(income);
    }
    public void saveExpense(Expense expense){
        outRepo.save(expense);
    }

    @PostMapping("/user")
    public User saveUser(User user){
        return userService.save(user);
    }

    // Arguments
    //A
    public void saveUser(User user){};
    //B
    public void saveUser(String userName, User user, Date date, boolean isAdmin){};

    //  No side effects
    public User saveUser(User user){
        // if statement should be avoided, why saveUser action is changing role of a user?
        if(user.isAdmin){
            user.setRole(user);
        }
        return userRepository.save(user);
    }
    // Evite duplicados, extraindo para novos métodos
    //A
    public Environment getEnvironment(){
        String version = versionService.getVersion();
        return environmentService.getEnvironment(version);
    }
    public Release getRelease(){
        String version = versionService.getVersion();
        return releaseService.getRelease(version);
    }
    //B
    public Environment getEnvironment(){
        return environmentService.getEnvironment(getVersion());
    }
    public Release getRelease(){
        return releaseService.getRelease(getVersion());
    }
    private String getVersion(){
        return versionService.getVersion();
    }

}