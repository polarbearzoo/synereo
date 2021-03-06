package com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn; // Java Package generated by the BNF Converter.

public class UNPAIR extends Instruction {
  public final String illunpair_;

  public UNPAIR(String p1) { illunpair_ = p1; }

  public <R,A> R accept(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.Instruction.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.UNPAIR) {
      com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.UNPAIR x = (com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.UNPAIR)o;
      return this.illunpair_.equals(x.illunpair_);
    }
    return false;
  }

  public int hashCode() {
    return this.illunpair_.hashCode();
  }


}
