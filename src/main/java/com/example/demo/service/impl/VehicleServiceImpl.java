@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepo repo;

    public VehicleServiceImpl(VehicleRepo repo) {
        this.repo = repo;
    }

    public Vehicle create(Vehicle v) {
        return repo.save(v);
    }

    public Vehicle getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehicle not found"));
    }

    public List<Vehicle> getAll() {
        return repo.findAll();
    }

    public Vehicle update(Long id, Vehicle v) {
        Vehicle ex = getById(id);
        ex.setVehicleNumber(v.getVehicleNumber());
        ex.setType(v.getType());
        return repo.save(ex);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
