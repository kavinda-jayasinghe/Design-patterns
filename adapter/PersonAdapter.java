package design.pattern.adapter;

public class PersonAdapter implements IPerson {
    private final IRemotePerson remotePerson;

    public PersonAdapter(IRemotePerson remotePerson) {
        this.remotePerson = remotePerson;
    }

    @Override
    public String generateFullName() {
        return remotePerson.getFirstName() + " " + remotePerson.getLastName();
    }

    @Override
    public String generateFullAddress() {
        return remotePerson.getAddressLine1() + ", " + remotePerson.getAddressLine2();
    }
}
