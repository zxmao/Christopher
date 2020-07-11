package com.christopher.strategy.sort;

import com.christopher.exception.MethodNotYetAvailableException;
import com.christopher.strategy.compar.Comparator;

public abstract class AbstractSorter<T> {

    /**
     * 选择排序
     * 效率O（n²），适用于排序小的列表。
     */
    public void selection(T[] t, Comparator<T> comparator){
        for (int i = 0; i < t.length; i++) {
            int minPos = i;
            for (T value : t) {
                minPos = comparator.compare(value, t[minPos]);
            }
            swap(t,i,minPos);
        }
    }

    private void swap(T[] t, int i, int j) {
        T temp = t[i];
        t[i] = t[j];
        t[j] = temp;
    }

    /**
     * 冒泡排序
     * 效率 O（n²）,适用于排序小列表。
     */
    public  void bubble(T[] t, Comparator<T> comparator) throws MethodNotYetAvailableException {
        throw new MethodNotYetAvailableException("暂未提供服务...",SortName.BUBBLE);
    }

    /**
     * 插入排序
     * 最佳效率O（n）；最糟效率O（n²）与冒泡、选择相同，适用于排序小列表
     * 若列表基本有序，则插入排序比冒泡、选择更有效率。
     */
    public  void insert(T[] t, Comparator<T> comparator) throws MethodNotYetAvailableException {
        throw new MethodNotYetAvailableException("暂未提供服务...",SortName.INSERT);
    }

    /**
     * 壳排序
     * 缩小增量排序
     * 适用于排序小列表。
     * 效率估计O（nlog2^n）~O（n^1.5），取决于增量值的最初大小。建议使用质数作为增量值，因为如果增量值是2的幂，则在下一个通道中会再次比较相同的元素。
     * 壳（Shell）排序改进了插入排序，减少了比较的次数。是不稳定的排序，因为排序过程中元素可能会前后跳跃。
     */
    public  void shell(T[] t, Comparator<T> comparator) throws MethodNotYetAvailableException {
        throw new MethodNotYetAvailableException("暂未提供服务...",SortName.BUBBLE);
    }

    /**
     * 归并排序
     * 效率O（nlogn），归并的最佳、平均和最糟用例效率之间没有差异。
     * 适用于排序大列表，基于分治法。
     */
    public  void merge(T[] t, Comparator<T> comparator) throws MethodNotYetAvailableException {
        throw new MethodNotYetAvailableException("暂未提供服务...",SortName.BUBBLE);
    }

    /**
     * 快速排序
     * 平均效率O（nlogn），适用于排序大列表。
     * 此算法的总时间取决于枢纽值的位置；选择第一个元素作为枢纽，可能导致O（n²）的最糟用例效率。若数基本有序，效率反而最差。选项中间值作为枢纽，效率是O（nlogn）。
     * 基于分治法。
     */
    public  void quick(T[] t, Comparator<T> comparator) throws MethodNotYetAvailableException {
        throw new MethodNotYetAvailableException("暂未提供服务...",SortName.BUBBLE);
    }


    /**
     * 堆排序
     * 堆排序的时间，主要由建立初始堆和反复重建堆这两部分的时间开销构成，它们均是通过调用Heapify实现的。
     *       堆排序的最坏时间复杂度为O(nlgn)。堆排序的平均性能较接近于最坏性能。     由于建初始堆所需的比较次数较多，所以堆排序不适宜于记录数较少的文件。     堆排序是就地排序，辅助空间为O(1)，     它是不稳定的排序方法。
     * 堆排序与直接插入排序的区别:
     *      直接选择排序中，为了从R[1..n]中选出关键字最小的记录，必须进行n-1次比较，然后在R[2..n]中选出关键字最小的记录，又需要做n-2次比较。事实上，后面的n-2次比较中，有许多比较可能在前面的n-1次比较中已经做过，但由于前一趟排序时未保留这些比较结果，所以后一趟排序时又重复执行了这些比较操作。
     *      堆排序可通过树形结构保存部分比较结果，可减少比较次数。
     */
    public  void heap(T[] t, Comparator<T> comparator) throws MethodNotYetAvailableException {
        throw new MethodNotYetAvailableException("暂未提供服务...",SortName.BUBBLE);
    }

    /**
     * 拓扑排序
     * 算法的时间复杂度O（n+e）。
     */
    public  void topological(T[] t, Comparator<T> comparator) throws MethodNotYetAvailableException {
        throw new MethodNotYetAvailableException("暂未提供服务...",SortName.BUBBLE);
    }



    /**
     * 锦标赛排序-又叫树型排序
     * 算法的时间复杂度O（n+e）。
     */
    public  void tree(T[] t, Comparator<T> comparator) throws MethodNotYetAvailableException {
        throw new MethodNotYetAvailableException("暂未提供服务...",SortName.BUBBLE);
    }

    /**
     * 基数排序
     * 基数排序法是属于稳定性的排序，其时间复杂度为O (nlog(r)m)，其中r为所采取的基数，而m为堆数，在某些时候，基数排序法的效率高于其它的比较性排序法。
     */
    public  void radix(T[] t, Comparator<T> comparator) throws MethodNotYetAvailableException {
        throw new MethodNotYetAvailableException("暂未提供服务...",SortName.BUBBLE);
    }


}
