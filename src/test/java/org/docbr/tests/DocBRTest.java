package org.docbr.tests;

import org.docbr.CPF;
import org.junit.Test;
import org.junit.Assert;

public class DocBRTest {
    @Test
    public void testCPF(){
        CPF cpf = new CPF("52998224725");
        Assert.assertEquals(cpf.getFormattedCPF(), "529.982.247-25");
        Assert.assertEquals(cpf.getCPF(), "52998224725");
    }
}
