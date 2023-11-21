package com.taboola.backstage.model.media.campaigns.items;

import com.taboola.backstage.model.media.campaigns.verifications.VerificationPixel;
import com.taboola.backstage.model.media.campaigns.viewability.ViewabilityTag;
import com.taboola.backstage.model.metadata.ExternalMetadata;

/**
 * Created by vladi
 * Date: 1/19/2018
 * Time: 10:48 PM
 * By Taboola
 */
public class CampaignItemOperation extends CampaignItem {

    private CampaignItemOperation() { }

    public static CampaignItemOperation create() {
        return new CampaignItemOperation();
    }

    public CampaignItemOperation setUrl(String url) {
        this.url = url;
        return this;
    }

    public CampaignItemOperation setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    public CampaignItemOperation setTitle(String title) {
        this.title = title;
        return this;
    }

    public CampaignItemOperation setActive(Boolean active) {
        this.isActive = active;
        return this;
    }

    public CampaignItemOperation setDescription(String description) {
        this.description = description;
        return this;
    }

    public CampaignItemOperation setCta(CampaignItemCTA cta) {
        this.cta = cta;
        return this;
    }

    public CampaignItemOperation setCreativeFocus(CampaignItemCreativeFocus creativeFocus) {
        this.creativeFocus = creativeFocus;
        return this;
    }

    public CampaignItemOperation setVerificationPixel(VerificationPixel verificationPixel) {
        this.verificationPixel = verificationPixel;
        return this;
    }

    public CampaignItemOperation setViewabilityTag(ViewabilityTag viewabilityTag) {
        this.viewabilityTag = viewabilityTag;
        return this;
    }

    public CampaignItemOperation setAppInstall(CampaignItemAppInstall appInstall) {
        this.appInstall = appInstall;
        return this;
    }

    public CampaignItemOperation setRating(CampaignItemRating rating) {
        this.rating = rating;
        return this;
    }

    public CampaignItemOperation setLogo(CampaignItemLogo logo) {
        this.logo = logo;
        return this;
    }

    public CampaignItemOperation setDisclaimer(CampaignItemDisclaimer disclaimer) {
        this.disclaimer = disclaimer;
        return this;
    }

    public CampaignItemOperation setExternalMetadata(ExternalMetadata externalMetadata) {
        this.externalMetadata = externalMetadata;
        return this;
    }
}
