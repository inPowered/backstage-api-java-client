/*
 * Copyright 2023 InPowered. All Rights Reserved.
 *
 *  This software is the proprietary information of InPowered.
 *  Use is subject to license terms.
 */

package com.taboola.backstage.model.media.campaigns;

/**
 * Created by Marcelo Dias on 10/06/2024.
 */
public class CampaignPredefinedTargetingOptions {
    private CampaignPredefinedSupplyTargeting predefinedSupplyTargeting;

    public CampaignPredefinedSupplyTargeting getPredefinedSupplyTargeting() {
        return predefinedSupplyTargeting;
    }

    public void setPredefinedSupplyTargeting(CampaignPredefinedSupplyTargeting predefinedSupplyTargeting) {
        this.predefinedSupplyTargeting = predefinedSupplyTargeting;
    }
}
