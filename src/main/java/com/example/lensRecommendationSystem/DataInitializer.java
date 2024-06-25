/*
package com.example.lensRecommendationSystem;

import com.example.lensRecommendationSystem.model.Lenses;
import com.example.lensRecommendationSystem.repo.LensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private LensesRepository lensesRepository;

    @Override
    public void run(String... args) throws Exception {
        lensesRepository.deleteAll();

        List<Lenses> lenses = Arrays.asList(
                // Canon EF
                new Lenses("Canon EF 50mm f/1.8 STM", "link", 125.0, 4.5, 50.0, 50.0, 1.8, "Yes", "Canon", "Canon EF", "Prime", "Portrait", "2023-05"),
                new Lenses("Canon EF 85mm f/1.4L IS USM", "link", 1599.0, 4.8, 85.0, 85.0, 1.4, "Yes", "Canon", "Canon EF", "Prime", "Portrait", "2022-09"),
                new Lenses("Canon EF 24-70mm f/2.8L II USM", "link", 1699.0, 4.7, 24.0, 70.0, 2.8, "No", "Canon", "Canon EF", "Zoom", "General", "2021-10"),
                new Lenses("Canon EF 70-200mm f/2.8L IS III USM", "link", 2099.0, 4.9, 70.0, 200.0, 2.8, "Yes", "Canon", "Canon EF", "Zoom", "Sports", "2020-11"),
                new Lenses("Canon EF 16-35mm f/4L IS USM", "link", 1099.0, 4.6, 16.0, 35.0, 4.0, "Yes", "Canon", "Canon EF", "Zoom", "Landscape", "2019-08"),

                // Canon EF-S
                new Lenses("Canon EF-S 24mm f/2.8 STM", "link", 149.0, 4.6, 24.0, 24.0, 2.8, "No", "Canon", "Canon EF-S", "Prime", "Street", "2022-07"),
                new Lenses("Canon EF-S 10-18mm f/4.5-5.6 IS STM", "link", 279.0, 4.5, 10.0, 18.0, 4.5, "Yes", "Canon", "Canon EF-S", "Zoom", "Landscape", "2021-06"),
                new Lenses("Canon EF-S 55-250mm f/4-5.6 IS STM", "link", 299.0, 4.4, 55.0, 250.0, 4.0, "Yes", "Canon", "Canon EF-S", "Zoom", "Wildlife", "2020-05"),
                new Lenses("Canon EF-S 18-55mm f/3.5-5.6 IS STM", "link", 199.0, 4.3, 18.0, 55.0, 3.5, "Yes", "Canon", "Canon EF-S", "Zoom", "General", "2019-09"),
                new Lenses("Canon EF-S 35mm f/2.8 Macro IS STM", "link", 349.0, 4.7, 35.0, 35.0, 2.8, "Yes", "Canon", "Canon EF-S", "Prime", "Macro", "2023-04"),

                // Nikon F Mount
                new Lenses("Nikon AF-S DX NIKKOR 35mm f/1.8G", "link", 195.0, 4.7, 35.0, 35.0, 1.8, "No", "Nikon", "Nikon F Mount", "Prime", "General", "2021-11"),
                new Lenses("Nikon AF-S NIKKOR 24-70mm f/2.8E ED VR", "link", 2396.0, 4.8, 24.0, 70.0, 2.8, "Yes", "Nikon", "Nikon F Mount", "Zoom", "General", "2020-03"),
                new Lenses("Nikon AF-S NIKKOR 50mm f/1.8G", "link", 216.0, 4.6, 50.0, 50.0, 1.8, "No", "Nikon", "Nikon F Mount", "Prime", "Portrait", "2019-05"),
                new Lenses("Nikon AF-S NIKKOR 70-200mm f/2.8E FL ED VR", "link", 2796.0, 4.9, 70.0, 200.0, 2.8, "Yes", "Nikon", "Nikon F Mount", "Zoom", "Sports", "2022-11"),
                new Lenses("Nikon AF-S NIKKOR 14-24mm f/2.8G ED", "link", 1896.0, 4.7, 14.0, 24.0, 2.8, "No", "Nikon", "Nikon F Mount", "Zoom", "Landscape", "2021-07"),

                // Sony E
                new Lenses("Sony FE 24-70mm f/2.8 GM", "link", 2198.0, 4.9, 24.0, 70.0, 2.8, "Yes", "Sony", "Sony E", "Zoom", "Travel", "2020-03"),
                new Lenses("Sony FE 50mm f/1.8", "link", 248.0, 4.4, 50.0, 50.0, 1.8, "No", "Sony", "Sony E", "Prime", "Portrait", "2021-04"),
                new Lenses("Sony FE 85mm f/1.4 GM", "link", 1798.0, 4.8, 85.0, 85.0, 1.4, "No", "Sony", "Sony E", "Prime", "Portrait", "2022-06"),
                new Lenses("Sony FE 16-35mm f/2.8 GM", "link", 2298.0, 4.7, 16.0, 35.0, 2.8, "Yes", "Sony", "Sony E", "Zoom", "Landscape", "2019-08"),
                new Lenses("Sony FE 70-200mm f/2.8 GM OSS", "link", 2498.0, 4.9, 70.0, 200.0, 2.8, "Yes", "Sony", "Sony E", "Zoom", "Sports", "2023-09"),

                // Fujifilm X Mount
                new Lenses("Fujifilm XF 16-55mm f/2.8 R LM WR", "link", 1199.0, 4.8, 16.0, 55.0, 2.8, "Yes", "Fujifilm", "Fujifilm X Mount", "Zoom", "General", "2024-01"),
                new Lenses("Fujifilm XF 35mm f/2 R WR", "link", 399.0, 4.7, 35.0, 35.0, 2.0, "No", "Fujifilm", "Fujifilm X Mount", "Prime", "Street", "2021-02"),
                new Lenses("Fujifilm XF 50-140mm f/2.8 R LM OIS WR", "link", 1599.0, 4.9, 50.0, 140.0, 2.8, "Yes", "Fujifilm", "Fujifilm X Mount", "Zoom", "Sports", "2020-09"),
                new Lenses("Fujifilm XF 10-24mm f/4 R OIS", "link", 999.0, 4.6, 10.0, 24.0, 4.0, "Yes", "Fujifilm", "Fujifilm X Mount", "Zoom", "Landscape", "2019-12"),
                new Lenses("Fujifilm XF 56mm f/1.2 R", "link", 999.0, 4.8, 56.0, 56.0, 1.2, "No", "Fujifilm", "Fujifilm X Mount", "Prime", "Portrait", "2022-08"),

                // Leica L
                new Lenses("Leica SL 24-90mm f/2.8-4", "link", 4950.0, 4.9, 24.0, 90.0, 2.8, "Yes", "Leica", "Leica L", "Zoom", "Professional", "2019-12"),
                new Lenses("Leica APO-Summicron-SL 50mm f/2 ASPH", "link", 5195.0, 4.8, 50.0, 50.0, 2.0, "No", "Leica", "Leica L", "Prime", "Portrait", "2021-05"),
                new Lenses("Leica Vario-Elmarit-SL 90-280mm f/2.8-4", "link", 6395.0, 4.9, 90.0, 280.0, 2.8, "Yes", "Leica", "Leica L", "Zoom", "Wildlife", "2022-03"),
                new Lenses("Leica Summilux-SL 50mm f/1.4 ASPH", "link", 5295.0, 4.7, 50.0, 50.0, 1.4, "No", "Leica", "Leica L", "Prime", "Low Light", "2020-08"),
                new Lenses("Leica Summicron-SL 35mm f/2 ASPH", "link", 4795.0, 4.8, 35.0, 35.0, 2.0, "No", "Leica", "Leica L", "Prime", "Street", "2019-10"),

                // Canon RF
                new Lenses("Canon RF 24-105mm f/4L IS USM", "link", 1099.0, 4.6, 24.0, 105.0, 4.0, "Yes", "Canon", "Canon RF", "Zoom", "General", "2023-08"),
                new Lenses("Canon RF 50mm f/1.2L USM", "link", 2299.0, 4.9, 50.0, 50.0, 1.2, "No", "Canon", "Canon RF", "Prime", "Portrait", "2022-03"),
                new Lenses("Canon RF 15-35mm f/2.8L IS USM", "link", 2299.0, 4.8, 15.0, 35.0, 2.8, "Yes", "Canon", "Canon RF", "Zoom", "Landscape", "2021-11"),
                new Lenses("Canon RF 70-200mm f/2.8L IS USM", "link", 2799.0, 4.9, 70.0, 200.0, 2.8, "Yes", "Canon", "Canon RF", "Zoom", "Sports", "2020-02"),
                new Lenses("Canon RF 85mm f/1.2L USM", "link", 2699.0, 4.8, 85.0, 85.0, 1.2, "No", "Canon", "Canon RF", "Prime", "Portrait", "2019-07"),

                // Nikon Z
                new Lenses("Nikon Z 50mm f/1.8 S", "link", 596.0, 4.8, 50.0, 50.0, 1.8, "Yes", "Nikon", "Nikon Z", "Prime", "Portrait", "2022-05"),
                new Lenses("Nikon Z 24-70mm f/2.8 S", "link", 2296.0, 4.9, 24.0, 70.0, 2.8, "Yes", "Nikon", "Nikon Z", "Zoom", "General", "2021-01"),
                new Lenses("Nikon Z 85mm f/1.8 S", "link", 796.0, 4.7, 85.0, 85.0, 1.8, "No", "Nikon", "Nikon Z", "Prime", "Portrait", "2020-06"),
                new Lenses("Nikon Z 14-30mm f/4 S", "link", 1296.0, 4.6, 14.0, 30.0, 4.0, "Yes", "Nikon", "Nikon Z", "Zoom", "Landscape", "2019-09"),
                new Lenses("Nikon Z 70-200mm f/2.8 VR S", "link", 2596.0, 4.9, 70.0, 200.0, 2.8, "Yes", "Nikon", "Nikon Z", "Zoom", "Sports", "2023-04")
        );

        lensesRepository.saveAll(lenses);
    }
}
*/
