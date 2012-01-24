package com.biosimilarity.lift.lib.kvdbJSON.Absyn; // Java Package generated by the BNF Converter.

public class DNSAddr extends NetLocation {
  public final ListDNSElement listdnselement_;

  public DNSAddr(ListDNSElement p1) { listdnselement_ = p1; }

  public <R,A> R accept(com.biosimilarity.lift.lib.kvdbJSON.Absyn.NetLocation.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.lib.kvdbJSON.Absyn.DNSAddr) {
      com.biosimilarity.lift.lib.kvdbJSON.Absyn.DNSAddr x = (com.biosimilarity.lift.lib.kvdbJSON.Absyn.DNSAddr)o;
      return this.listdnselement_.equals(x.listdnselement_);
    }
    return false;
  }

  public int hashCode() {
    return this.listdnselement_.hashCode();
  }


}