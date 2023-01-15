package com.ka.sfgpetclinic.bootstrap;

import com.ka.sfgpetclinic.model.Owner;
import com.ka.sfgpetclinic.model.Vet;
import com.ka.sfgpetclinic.services.OwnerService;
import com.ka.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("James");
        owner1.setLastName("Maddison");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setLastName("Peresic");
        owner2.setFirstName("Ivan");

        ownerService.save(owner2);
        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("hans");
        vet2.setLastName("Porter");

        vetService.save(vet2);
        System.out.println("Loaded Vets...");
    }
}
