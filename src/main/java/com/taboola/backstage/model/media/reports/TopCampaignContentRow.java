package com.taboola.backstage.model.media.reports;

import java.util.Objects;

import com.taboola.backstage.model.dynamic.DynamicFields;
import com.taboola.backstage.model.dynamic.DynamicRow;

/**
 * Created by vladi
 * Date: 10/27/2017
 * Time: 10:09 PM
 * By Taboola
 */
public class TopCampaignContentRow implements DynamicRow {

    private String item;
    private String itemName;
    private String thumbnailUrl;
    private String url;
    private Long campaign;
    private String campaignName;
    private String contentProvider;
    private String contentProviderName;
    private Long impressions;
    private Double ctr;
    private Double vctr;
    private Long clicks;
    private Double cpc;
    private Double cpm;
    private Double vcpm;
    private Double spent;
    private String currency;
    private Long actions;
    private Double cpa;
    private Double cvr;
    private Double roas;
    private Long visibleImpressions;

    // dynamic
    private DynamicFields dynamicFields;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getCampaign() {
        return campaign;
    }

    public void setCampaign(Long campaign) {
        this.campaign = campaign;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getContentProvider() {
        return contentProvider;
    }

    public void setContentProvider(String contentProvider) {
        this.contentProvider = contentProvider;
    }

    public String getContentProviderName() {
        return contentProviderName;
    }

    public void setContentProviderName(String contentProviderName) {
        this.contentProviderName = contentProviderName;
    }

    public Long getImpressions() {
        return impressions;
    }

    public void setImpressions(Long impressions) {
        this.impressions = impressions;
    }

    public Double getCtr() {
        return ctr;
    }

    public void setCtr(Double ctr) {
        this.ctr = ctr;
    }

    public Long getClicks() {
        return clicks;
    }

    public void setClicks(Long clicks) {
        this.clicks = clicks;
    }

    public Double getCpc() {
        return cpc;
    }

    public void setCpc(Double cpc) {
        this.cpc = cpc;
    }

    public Double getCpm() {
        return cpm;
    }

    public void setCpm(Double cpm) {
        this.cpm = cpm;
    }

    public Double getSpent() {
        return spent;
    }

    public void setSpent(Double spent) {
        this.spent = spent;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getActions() {
        return actions;
    }

    public void setActions(Long actions) {
        this.actions = actions;
    }

    public Double getCpa() {
        return cpa;
    }

    public void setCpa(Double cpa) {
        this.cpa = cpa;
    }

    public Double getCvr() {
        return cvr;
    }

    public void setCvr(Double cvr) {
        this.cvr = cvr;
    }

    public Double getRoas() {
        return roas;
    }

    public TopCampaignContentRow setRoas(Double roas) {
        this.roas = roas;
        return this;
    }

    public Double getVctr() {
        return vctr;
    }

    public TopCampaignContentRow setVctr(Double vctr) {
        this.vctr = vctr;
        return this;
    }

    public Double getVcpm() {
        return vcpm;
    }

    public TopCampaignContentRow setVcpm(Double vcpm) {
        this.vcpm = vcpm;
        return this;
    }

    public Long getVisibleImpressions() {
        return visibleImpressions;
    }

    public TopCampaignContentRow setVisibleImpressions(Long visibleImpressions) {
        this.visibleImpressions = visibleImpressions;
        return this;
    }

    public DynamicFields getDynamicFields() {
        return dynamicFields;
    }

    public TopCampaignContentRow setDynamicFields(DynamicFields dynamicFields) {
        this.dynamicFields = dynamicFields;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TopCampaignContentRow that = (TopCampaignContentRow) o;
        return Objects.equals(item, that.item) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(thumbnailUrl, that.thumbnailUrl) &&
                Objects.equals(url, that.url) &&
                Objects.equals(campaign, that.campaign) &&
                Objects.equals(campaignName, that.campaignName) &&
                Objects.equals(contentProvider, that.contentProvider) &&
                Objects.equals(contentProviderName, that.contentProviderName) &&
                Objects.equals(impressions, that.impressions) &&
                Objects.equals(ctr, that.ctr) &&
                Objects.equals(vctr, that.vctr) &&
                Objects.equals(clicks, that.clicks) &&
                Objects.equals(cpc, that.cpc) &&
                Objects.equals(cpm, that.cpm) &&
                Objects.equals(vcpm, that.vcpm) &&
                Objects.equals(spent, that.spent) &&
                Objects.equals(currency, that.currency) &&
                Objects.equals(actions, that.actions) &&
                Objects.equals(cpa, that.cpa) &&
                Objects.equals(cvr, that.cvr) &&
                Objects.equals(roas, that.roas) &&
                Objects.equals(visibleImpressions, that.visibleImpressions) &&
                Objects.equals(dynamicFields, that.dynamicFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, itemName, thumbnailUrl, url, campaign, campaignName, contentProvider,
                contentProviderName, impressions, ctr, vctr, clicks, cpc, cpm, vcpm, spent, currency,
                actions, cpa, cvr, roas, visibleImpressions, dynamicFields);
    }

    @Override
    public String toString() {
        return "TopCampaignContentRow{" +
                "item='" + item + '\'' +
                ", itemName='" + itemName + '\'' +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                ", url='" + url + '\'' +
                ", campaign='" + campaign + '\'' +
                ", campaignName='" + campaignName + '\'' +
                ", contentProvider='" + contentProvider + '\'' +
                ", contentProviderName='" + contentProviderName + '\'' +
                ", impressions=" + impressions +
                ", ctr=" + ctr +
                ", vctr=" + vctr +
                ", clicks=" + clicks +
                ", cpc=" + cpc +
                ", cpm=" + cpm +
                ", vcpm=" + vcpm +
                ", spent=" + spent +
                ", currency='" + currency + '\'' +
                ", actions=" + actions +
                ", cpa=" + cpa +
                ", cvr=" + cvr +
                ", roas=" + roas +
                ", visibleImpressions=" + visibleImpressions +
                ", dynamicFields=" + dynamicFields +
                '}';
    }
}
