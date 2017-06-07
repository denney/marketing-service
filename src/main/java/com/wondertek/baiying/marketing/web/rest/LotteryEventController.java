package com.wondertek.baiying.marketing.web.rest;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.wondertek.baiying.marketing.domain.LotteryEvent;
import com.wondertek.baiying.marketing.service.LotteryEventService;

@RestController
@RequestMapping("/lotteryEvent")
public class LotteryEventController {

    private final Logger log = LoggerFactory.getLogger(LotteryEventController.class);

	@Autowired
	private LotteryEventService lotteryEventService;

    @RequestMapping(value = "/all/{page}/{size}/{property}/{direction}",method = RequestMethod.GET)
    public Page<LotteryEvent> findAll(@PathVariable int page, @PathVariable int size, @PathVariable String direction,
                                      @PathVariable String property){

        Page<LotteryEvent> lotteryEventPage = lotteryEventService.findAll(page,size,direction,property);
        return lotteryEventPage;
    }

    @RequestMapping(value = "/lotteryEvents",method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public LotteryEvent save(LotteryEvent lotteryEvent){
        lotteryEvent.setCreateTime(new Date());
        LotteryEvent event =  lotteryEventService.save(lotteryEvent);
        return event;
    }

    @RequestMapping(value = "/lotteryEvents/{id}",method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public LotteryEvent findById (@PathVariable String id) {
        return lotteryEventService.findById(id);
    }
}
