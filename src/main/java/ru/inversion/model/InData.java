package ru.inversion.model;

public class InData  {
    private Long cusnum;
    private Long pr_cusinf;             // Признак (1/0): возвращать основную информацию по клиенту
    private Long pr_cusinf_dop;         // Признак (1/0): возвращать дополнительную информацию по клиенту
    private Long pr_cus_dep;            // Признак (1/0): возвращать информацию  о банковских вкладах клиента
    private Long pr_cus_card;           // Признак (1/0): возвращать информацию  о банковских картах  клиента
    private Long pr_cus_acc;            // Признак (1/0): возвращать информацию  о счетах клиента
    private Long pr_cr_hist;            // Признак (1/0): возвращать внутреннюю кредитную историю  клиента
    private Long pr_arrears;            // Признак (1/0): возвращать расшифровку  просрочек клиента

    public InData() {
    }

    public Long getCusnum() {
        return cusnum;
    }

    public void setCusnum(Long cusnum) {
        this.cusnum = cusnum;
    }

    public Long getPr_cusinf() {
        return pr_cusinf;
    }

    public void setPr_cusinf(Long pr_cusinf) {
        this.pr_cusinf = pr_cusinf;
    }

    public Long getPr_cusinf_dop() {
        return pr_cusinf_dop;
    }

    public void setPr_cusinf_dop(Long pr_cusinf_dop) {
        this.pr_cusinf_dop = pr_cusinf_dop;
    }

    public Long getPr_cus_dep() {
        return pr_cus_dep;
    }

    public void setPr_cus_dep(Long pr_cus_dep) {
        this.pr_cus_dep = pr_cus_dep;
    }

    public Long getPr_cus_card() {
        return pr_cus_card;
    }

    public void setPr_cus_card(Long pr_cus_card) {
        this.pr_cus_card = pr_cus_card;
    }

    public Long getPr_cus_acc() {
        return pr_cus_acc;
    }

    public void setPr_cus_acc(Long pr_cus_acc) {
        this.pr_cus_acc = pr_cus_acc;
    }

    public Long getPr_cr_hist() {
        return pr_cr_hist;
    }

    public void setPr_cr_hist(Long pr_cr_hist) {
        this.pr_cr_hist = pr_cr_hist;
    }

    public Long getPr_arrears() {
        return pr_arrears;
    }

    public void setPr_arrears(Long pr_arrears) {
        this.pr_arrears = pr_arrears;
    }
}
