package algorithms.greedy.huffman;

import java.util.Comparator;

public class ImplementComparator implements Comparator<HuffmanNode> {
    @Override
    public int compare(HuffmanNode x, HuffmanNode y) {
        return x.item - y.item;
    }
}
