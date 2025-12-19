@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleService service;

    public VehicleController(VehicleService service) {
        this.service = service;
    }

    @PostMapping
    public Vehicle create(@RequestBody Vehicle v) {
        return service.create(v);
    }

    @GetMapping("/{id}")
    public Vehicle get(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<Vehicle> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public Vehicle update(@PathVariable Long id, @RequestBody Vehicle v) {
        return service.update(id, v);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
