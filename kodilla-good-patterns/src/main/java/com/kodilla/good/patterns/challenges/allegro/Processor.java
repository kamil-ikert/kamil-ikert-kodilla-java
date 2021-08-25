package com.kodilla.good.patterns.challenges.allegro;

public class Processor {
    private InformationService informationService;
    private SaleService saleService;
    private SaleRepository saleRepository;

    public Processor(InformationService informationService, SaleService saleService, SaleRepository saleRepository) {
        this.informationService = informationService;
        this.saleService = saleService;
        this.saleRepository = saleRepository;
    }

    public void process(Order order) {
        boolean isSold = saleService.sold(order.getUser(), order.getProduct(), order.getDateOfSale());

        if(isSold) {
            informationService.inform(order.getUser(), order.getProduct(), order.getDateOfSale(), isSold);
            saleRepository.createSaleRepository(order.getUser(), order.getProduct(), order.getDateOfSale());
        } else {
            informationService.inform(order.getUser(), order.getProduct(), order.getDateOfSale(), isSold);
        }
    }
}
