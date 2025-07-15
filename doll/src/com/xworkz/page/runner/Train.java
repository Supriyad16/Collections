package com.xworkz.page.runner;

import com.xworkz.page.dto.TrainDTO;
import java.util.HashMap;
import java.util.Map;

    public class Train {
        public static void main(String[] args) {

            Map<String, TrainDTO> trains = new HashMap<>();

            trains.put("Rajdhani", new TrainDTO(12301, "Rajdhani Express", "Delhi", "Mumbai", "Express", 22, 1200, true, "Indian Railways", 2500));
            trains.put("Shatabdi", new TrainDTO(12001, "Shatabdi Express", "Delhi", "Bhopal", "Superfast", 18, 1000, true, "Indian Railways", 1800));
            trains.put("Duronto", new TrainDTO(12267, "Duronto Express", "Mumbai", "Delhi", "Superfast", 20, 1300, true, "Indian Railways", 2400));
            trains.put("Garib Rath", new TrainDTO(12909, "Garib Rath", "Mumbai", "Delhi", "AC Express", 18, 1100, false, "Indian Railways", 1200));
            trains.put("Intercity", new TrainDTO(12127, "Intercity Express", "Bangalore", "Hubli", "Express", 16, 900, false, "South Western", 700));
            trains.put("Vande Bharat", new TrainDTO(22436, "Vande Bharat", "Delhi", "Varanasi", "Semi High-Speed", 16, 1000, true, "Indian Railways", 2100));
            trains.put("Tejas", new TrainDTO(82501, "Tejas Express", "Lucknow", "Delhi", "Luxury", 20, 950, true, "IRCTC", 2300));
            trains.put("Jan Shatabdi", new TrainDTO(12071, "Jan Shatabdi", "Pune", "Mumbai", "Superfast", 15, 850, false, "Indian Railways", 600));
            trains.put("Double Decker", new TrainDTO(22625, "Double Decker", "Chennai", "Bangalore", "AC Express", 16, 1000, false, "Southern", 850));
            trains.put("Humsafar", new TrainDTO(12237, "Humsafar Express", "Howrah", "Bangalore", "AC 3-Tier", 22, 1300, true, "Indian Railways", 2000));

            for (Map.Entry<String, TrainDTO> entry : trains.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

