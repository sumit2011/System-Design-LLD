package strategy;

import models.Ticket;
import java.time.Duration;
import java.time.LocalDateTime;


public class HourlyPricingStrategy implements PricingStrategy{
    private static final double hourlyRate = 50.0;

    public double calculatePrice(Ticket ticket){
        if(ticket.getExitTime() == null){
            throw new IllegalStateException("Ticket is still open. Cannot calculate price.");
        }

        long  hours = Duration.between(
            ticket.getEntryTime(),ticket.getExitTime()
        ).toHours();

        hours = Math.max(hours,1);
        return hours*hourlyRate;
    }
}